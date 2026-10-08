// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database. By default, all databases are queried. You can also enter a database name to query. Only one database name can be entered at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>Database</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The end time of the query. The end time must be later than the start time, and the interval between the start time and end time must be 7 days or less. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>If DAS Enterprise Edition V3 is activated and you use the SQL Explorer and Audit feature it provides, you can query data within the hot data storage duration. You can call <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> to query the activated Enterprise Edition information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-06T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to generate an audit file or return a list of SQL records. Valid values:</p>
     * <ul>
     * <li><strong>File</strong>: If you set this parameter to File, an audit file is generated. Only common parameters are returned. You must call the DescribeSQLLogFiles operation to obtain the download URL of the file.</li>
     * <li><strong>Stream</strong>: This is the default value. A list of SQL records is returned.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is set to <strong>File</strong>, only MySQL (with Premium Local SSDs) and SQL Server instances are supported, and a maximum of 1,000,000 log entries are recorded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Stream</p>
     */
    @NameInMap("Form")
    public String form;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be a positive integer that does not exceed the maximum value of the Integer data type.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keywords that are used for the query.</p>
     * <ul>
     * <li><p>When you generate an audit file by calling this operation (the <strong>Form</strong> request parameter is set to <strong>File</strong>), keyword-based filtering is not supported.</p>
     * </li>
     * <li><p>Separate multiple keywords with spaces. You can specify up to 10 keywords. The logical relationship among keywords is <strong>and</strong>.</p>
     * </li>
     * <li><p>If a field name in the SQL statement uses backticks (\<code>), you must also include the backticks when using the field name as a keyword. For example, if the field name is \\</code>id\<code>, enter \\</code>id\` instead of id.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you enter keywords, the system matches the keywords against the <strong>Database</strong>, <strong>User</strong>, and <strong>QueryKeywords</strong> parameters simultaneously. The logical relationship among the three request parameters is <strong>and</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("QueryKeywords")
    public String queryKeywords;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("SQLId")
    public Long SQLId;

    /**
     * <p>The start time of the query. You can query data within the last 7 days from the current date. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>If DAS Enterprise Edition V3 is activated and you use the SQL Explorer and Audit feature it provides, you can query data within the hot data storage duration. You can call <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> to query the activated Enterprise Edition information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2011-06-01T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The username. By default, all users are queried. You can also enter a username to query. Only one username can be entered at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeSQLLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsRequest self = new DescribeSQLLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSQLLogRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeSQLLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogRecordsRequest setForm(String form) {
        this.form = form;
        return this;
    }
    public String getForm() {
        return this.form;
    }

    public DescribeSQLLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSQLLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSQLLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSQLLogRecordsRequest setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
        return this;
    }
    public String getQueryKeywords() {
        return this.queryKeywords;
    }

    public DescribeSQLLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSQLLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSQLLogRecordsRequest setSQLId(Long SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public Long getSQLId() {
        return this.SQLId;
    }

    public DescribeSQLLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
