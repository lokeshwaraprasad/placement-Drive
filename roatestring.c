bool rotateString(char* s1, char* s2) {
    int n = strlen(s1);
    if (n != strlen(s2))
        return false;

    // Allocate buffer large enough to hold s1+s1
    char* temp = (char*)malloc(2 * n + 1);
    if (!temp) return false;   // allocation check

    strcpy(temp, s1);
    strcat(temp, s1);

    bool result = (strstr(temp, s2) != NULL);

    free(temp);
    return result;
}
