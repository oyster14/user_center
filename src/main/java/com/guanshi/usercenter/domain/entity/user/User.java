package com.guanshi.usercenter.domain.entity.user;

import java.util.Date;
import javax.persistence.*;

/**
 * 表名：user
 * 表注释：Users and global privileges
*/
@Table(name = "user")
public class User {
    @Id
    @Column(name = "User")
    private String user;

    @Column(name = "Host")
    private String host;

    @Column(name = "Select_priv")
    private String selectPriv;

    @Column(name = "Insert_priv")
    private String insertPriv;

    @Column(name = "Update_priv")
    private String updatePriv;

    @Column(name = "Delete_priv")
    private String deletePriv;

    @Column(name = "Create_priv")
    private String createPriv;

    @Column(name = "Drop_priv")
    private String dropPriv;

    @Column(name = "Reload_priv")
    private String reloadPriv;

    @Column(name = "Shutdown_priv")
    private String shutdownPriv;

    @Column(name = "Process_priv")
    private String processPriv;

    @Column(name = "File_priv")
    private String filePriv;

    @Column(name = "Grant_priv")
    private String grantPriv;

    @Column(name = "References_priv")
    private String referencesPriv;

    @Column(name = "Index_priv")
    private String indexPriv;

    @Column(name = "Alter_priv")
    private String alterPriv;

    @Column(name = "Show_db_priv")
    private String showDbPriv;

    @Column(name = "Super_priv")
    private String superPriv;

    @Column(name = "Create_tmp_table_priv")
    private String createTmpTablePriv;

    @Column(name = "Lock_tables_priv")
    private String lockTablesPriv;

    @Column(name = "Execute_priv")
    private String executePriv;

    @Column(name = "Repl_slave_priv")
    private String replSlavePriv;

    @Column(name = "Repl_client_priv")
    private String replClientPriv;

    @Column(name = "Create_view_priv")
    private String createViewPriv;

    @Column(name = "Show_view_priv")
    private String showViewPriv;

    @Column(name = "Create_routine_priv")
    private String createRoutinePriv;

    @Column(name = "Alter_routine_priv")
    private String alterRoutinePriv;

    @Column(name = "Create_user_priv")
    private String createUserPriv;

    @Column(name = "Event_priv")
    private String eventPriv;

    @Column(name = "Trigger_priv")
    private String triggerPriv;

    @Column(name = "Create_tablespace_priv")
    private String createTablespacePriv;

    @Column(name = "ssl_type")
    private String sslType;

    @Column(name = "max_questions")
    private Integer maxQuestions;

    @Column(name = "max_updates")
    private Integer maxUpdates;

    @Column(name = "max_connections")
    private Integer maxConnections;

    @Column(name = "max_user_connections")
    private Integer maxUserConnections;

    private String plugin;

    @Column(name = "password_expired")
    private String passwordExpired;

    @Column(name = "password_last_changed")
    private Date passwordLastChanged;

    @Column(name = "password_lifetime")
    private Short passwordLifetime;

    @Column(name = "account_locked")
    private String accountLocked;

    @Column(name = "Create_role_priv")
    private String createRolePriv;

    @Column(name = "Drop_role_priv")
    private String dropRolePriv;

    @Column(name = "Password_reuse_history")
    private Short passwordReuseHistory;

    @Column(name = "Password_reuse_time")
    private Short passwordReuseTime;

    @Column(name = "ssl_cipher")
    private byte[] sslCipher;

    @Column(name = "x509_issuer")
    private byte[] x509Issuer;

    @Column(name = "x509_subject")
    private byte[] x509Subject;

    @Column(name = "authentication_string")
    private String authenticationString;

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return selectPriv
     */
    public String getSelectPriv() {
        return selectPriv;
    }

    /**
     * @param selectPriv
     */
    public void setSelectPriv(String selectPriv) {
        this.selectPriv = selectPriv;
    }

    /**
     * @return insertPriv
     */
    public String getInsertPriv() {
        return insertPriv;
    }

    /**
     * @param insertPriv
     */
    public void setInsertPriv(String insertPriv) {
        this.insertPriv = insertPriv;
    }

    /**
     * @return updatePriv
     */
    public String getUpdatePriv() {
        return updatePriv;
    }

    /**
     * @param updatePriv
     */
    public void setUpdatePriv(String updatePriv) {
        this.updatePriv = updatePriv;
    }

    /**
     * @return deletePriv
     */
    public String getDeletePriv() {
        return deletePriv;
    }

    /**
     * @param deletePriv
     */
    public void setDeletePriv(String deletePriv) {
        this.deletePriv = deletePriv;
    }

    /**
     * @return createPriv
     */
    public String getCreatePriv() {
        return createPriv;
    }

    /**
     * @param createPriv
     */
    public void setCreatePriv(String createPriv) {
        this.createPriv = createPriv;
    }

    /**
     * @return dropPriv
     */
    public String getDropPriv() {
        return dropPriv;
    }

    /**
     * @param dropPriv
     */
    public void setDropPriv(String dropPriv) {
        this.dropPriv = dropPriv;
    }

    /**
     * @return reloadPriv
     */
    public String getReloadPriv() {
        return reloadPriv;
    }

    /**
     * @param reloadPriv
     */
    public void setReloadPriv(String reloadPriv) {
        this.reloadPriv = reloadPriv;
    }

    /**
     * @return shutdownPriv
     */
    public String getShutdownPriv() {
        return shutdownPriv;
    }

    /**
     * @param shutdownPriv
     */
    public void setShutdownPriv(String shutdownPriv) {
        this.shutdownPriv = shutdownPriv;
    }

    /**
     * @return processPriv
     */
    public String getProcessPriv() {
        return processPriv;
    }

    /**
     * @param processPriv
     */
    public void setProcessPriv(String processPriv) {
        this.processPriv = processPriv;
    }

    /**
     * @return filePriv
     */
    public String getFilePriv() {
        return filePriv;
    }

    /**
     * @param filePriv
     */
    public void setFilePriv(String filePriv) {
        this.filePriv = filePriv;
    }

    /**
     * @return grantPriv
     */
    public String getGrantPriv() {
        return grantPriv;
    }

    /**
     * @param grantPriv
     */
    public void setGrantPriv(String grantPriv) {
        this.grantPriv = grantPriv;
    }

    /**
     * @return referencesPriv
     */
    public String getReferencesPriv() {
        return referencesPriv;
    }

    /**
     * @param referencesPriv
     */
    public void setReferencesPriv(String referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    /**
     * @return indexPriv
     */
    public String getIndexPriv() {
        return indexPriv;
    }

    /**
     * @param indexPriv
     */
    public void setIndexPriv(String indexPriv) {
        this.indexPriv = indexPriv;
    }

    /**
     * @return alterPriv
     */
    public String getAlterPriv() {
        return alterPriv;
    }

    /**
     * @param alterPriv
     */
    public void setAlterPriv(String alterPriv) {
        this.alterPriv = alterPriv;
    }

    /**
     * @return showDbPriv
     */
    public String getShowDbPriv() {
        return showDbPriv;
    }

    /**
     * @param showDbPriv
     */
    public void setShowDbPriv(String showDbPriv) {
        this.showDbPriv = showDbPriv;
    }

    /**
     * @return superPriv
     */
    public String getSuperPriv() {
        return superPriv;
    }

    /**
     * @param superPriv
     */
    public void setSuperPriv(String superPriv) {
        this.superPriv = superPriv;
    }

    /**
     * @return createTmpTablePriv
     */
    public String getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    /**
     * @param createTmpTablePriv
     */
    public void setCreateTmpTablePriv(String createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    /**
     * @return lockTablesPriv
     */
    public String getLockTablesPriv() {
        return lockTablesPriv;
    }

    /**
     * @param lockTablesPriv
     */
    public void setLockTablesPriv(String lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    /**
     * @return executePriv
     */
    public String getExecutePriv() {
        return executePriv;
    }

    /**
     * @param executePriv
     */
    public void setExecutePriv(String executePriv) {
        this.executePriv = executePriv;
    }

    /**
     * @return replSlavePriv
     */
    public String getReplSlavePriv() {
        return replSlavePriv;
    }

    /**
     * @param replSlavePriv
     */
    public void setReplSlavePriv(String replSlavePriv) {
        this.replSlavePriv = replSlavePriv;
    }

    /**
     * @return replClientPriv
     */
    public String getReplClientPriv() {
        return replClientPriv;
    }

    /**
     * @param replClientPriv
     */
    public void setReplClientPriv(String replClientPriv) {
        this.replClientPriv = replClientPriv;
    }

    /**
     * @return createViewPriv
     */
    public String getCreateViewPriv() {
        return createViewPriv;
    }

    /**
     * @param createViewPriv
     */
    public void setCreateViewPriv(String createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    /**
     * @return showViewPriv
     */
    public String getShowViewPriv() {
        return showViewPriv;
    }

    /**
     * @param showViewPriv
     */
    public void setShowViewPriv(String showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    /**
     * @return createRoutinePriv
     */
    public String getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    /**
     * @param createRoutinePriv
     */
    public void setCreateRoutinePriv(String createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    /**
     * @return alterRoutinePriv
     */
    public String getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    /**
     * @param alterRoutinePriv
     */
    public void setAlterRoutinePriv(String alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    /**
     * @return createUserPriv
     */
    public String getCreateUserPriv() {
        return createUserPriv;
    }

    /**
     * @param createUserPriv
     */
    public void setCreateUserPriv(String createUserPriv) {
        this.createUserPriv = createUserPriv;
    }

    /**
     * @return eventPriv
     */
    public String getEventPriv() {
        return eventPriv;
    }

    /**
     * @param eventPriv
     */
    public void setEventPriv(String eventPriv) {
        this.eventPriv = eventPriv;
    }

    /**
     * @return triggerPriv
     */
    public String getTriggerPriv() {
        return triggerPriv;
    }

    /**
     * @param triggerPriv
     */
    public void setTriggerPriv(String triggerPriv) {
        this.triggerPriv = triggerPriv;
    }

    /**
     * @return createTablespacePriv
     */
    public String getCreateTablespacePriv() {
        return createTablespacePriv;
    }

    /**
     * @param createTablespacePriv
     */
    public void setCreateTablespacePriv(String createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv;
    }

    /**
     * @return sslType
     */
    public String getSslType() {
        return sslType;
    }

    /**
     * @param sslType
     */
    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    /**
     * @return maxQuestions
     */
    public Integer getMaxQuestions() {
        return maxQuestions;
    }

    /**
     * @param maxQuestions
     */
    public void setMaxQuestions(Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    /**
     * @return maxUpdates
     */
    public Integer getMaxUpdates() {
        return maxUpdates;
    }

    /**
     * @param maxUpdates
     */
    public void setMaxUpdates(Integer maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    /**
     * @return maxConnections
     */
    public Integer getMaxConnections() {
        return maxConnections;
    }

    /**
     * @param maxConnections
     */
    public void setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * @return maxUserConnections
     */
    public Integer getMaxUserConnections() {
        return maxUserConnections;
    }

    /**
     * @param maxUserConnections
     */
    public void setMaxUserConnections(Integer maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    /**
     * @return plugin
     */
    public String getPlugin() {
        return plugin;
    }

    /**
     * @param plugin
     */
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    /**
     * @return passwordExpired
     */
    public String getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * @param passwordExpired
     */
    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    /**
     * @return passwordLastChanged
     */
    public Date getPasswordLastChanged() {
        return passwordLastChanged;
    }

    /**
     * @param passwordLastChanged
     */
    public void setPasswordLastChanged(Date passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    /**
     * @return passwordLifetime
     */
    public Short getPasswordLifetime() {
        return passwordLifetime;
    }

    /**
     * @param passwordLifetime
     */
    public void setPasswordLifetime(Short passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    /**
     * @return accountLocked
     */
    public String getAccountLocked() {
        return accountLocked;
    }

    /**
     * @param accountLocked
     */
    public void setAccountLocked(String accountLocked) {
        this.accountLocked = accountLocked;
    }

    /**
     * @return createRolePriv
     */
    public String getCreateRolePriv() {
        return createRolePriv;
    }

    /**
     * @param createRolePriv
     */
    public void setCreateRolePriv(String createRolePriv) {
        this.createRolePriv = createRolePriv;
    }

    /**
     * @return dropRolePriv
     */
    public String getDropRolePriv() {
        return dropRolePriv;
    }

    /**
     * @param dropRolePriv
     */
    public void setDropRolePriv(String dropRolePriv) {
        this.dropRolePriv = dropRolePriv;
    }

    /**
     * @return passwordReuseHistory
     */
    public Short getPasswordReuseHistory() {
        return passwordReuseHistory;
    }

    /**
     * @param passwordReuseHistory
     */
    public void setPasswordReuseHistory(Short passwordReuseHistory) {
        this.passwordReuseHistory = passwordReuseHistory;
    }

    /**
     * @return passwordReuseTime
     */
    public Short getPasswordReuseTime() {
        return passwordReuseTime;
    }

    /**
     * @param passwordReuseTime
     */
    public void setPasswordReuseTime(Short passwordReuseTime) {
        this.passwordReuseTime = passwordReuseTime;
    }

    /**
     * @return sslCipher
     */
    public byte[] getSslCipher() {
        return sslCipher;
    }

    /**
     * @param sslCipher
     */
    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    /**
     * @return x509Issuer
     */
    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    /**
     * @param x509Issuer
     */
    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    /**
     * @return x509Subject
     */
    public byte[] getX509Subject() {
        return x509Subject;
    }

    /**
     * @param x509Subject
     */
    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    /**
     * @return authenticationString
     */
    public String getAuthenticationString() {
        return authenticationString;
    }

    /**
     * @param authenticationString
     */
    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }
}