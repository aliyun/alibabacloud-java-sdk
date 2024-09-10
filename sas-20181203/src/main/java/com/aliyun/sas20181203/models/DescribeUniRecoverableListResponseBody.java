// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniRecoverableListResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>msdb</p>
     */
    @NameInMap("Database")
    public String database;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of the backup snapshots.</p>
     */
    @NameInMap("RecoverableInfoList")
    public java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> recoverableInfoList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D0760****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUniRecoverableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniRecoverableListResponseBody self = new DescribeUniRecoverableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniRecoverableListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeUniRecoverableListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUniRecoverableListResponseBody setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeUniRecoverableListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUniRecoverableListResponseBody setRecoverableInfoList(java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> recoverableInfoList) {
        this.recoverableInfoList = recoverableInfoList;
        return this;
    }
    public java.util.List<DescribeUniRecoverableListResponseBodyRecoverableInfoList> getRecoverableInfoList() {
        return this.recoverableInfoList;
    }

    public DescribeUniRecoverableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniRecoverableListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUniRecoverableListResponseBodyRecoverableInfoList extends TeaModel {
        /**
         * <p>The timestamp of the first backup. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671468180000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <p>The timestamp of the last backup. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671468180000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The identifier of the point in time for restoration in the backup version that is used. The database is an Oracle database.</p>
         * 
         * <strong>example:</strong>
         * <p>4529940.0</p>
         */
        @NameInMap("ResetScn")
        public String resetScn;

        /**
         * <p>The point in time for restoration in the backup version that is used. The database is an Oracle database.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30 08:04:36</p>
         */
        @NameInMap("ResetTime")
        public Long resetTime;

        /**
         * <p>The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the database</li>
         * <li><strong>files</strong>: the path to the database files</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;files&quot;: {
         *             &quot;qtc&quot;: &quot;F:\\database\\qtc.mdf&quot;,
         *             &quot;qtc_log&quot;: &quot;F:\\database\\qtc_0.ldf&quot;
         *       },
         *       &quot;name&quot;: &quot;qtc&quot;
         * }</p>
         */
        @NameInMap("RestoreInfo")
        public String restoreInfo;

        public static DescribeUniRecoverableListResponseBodyRecoverableInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniRecoverableListResponseBodyRecoverableInfoList self = new DescribeUniRecoverableListResponseBodyRecoverableInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setResetScn(String resetScn) {
            this.resetScn = resetScn;
            return this;
        }
        public String getResetScn() {
            return this.resetScn;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setResetTime(Long resetTime) {
            this.resetTime = resetTime;
            return this;
        }
        public Long getResetTime() {
            return this.resetTime;
        }

        public DescribeUniRecoverableListResponseBodyRecoverableInfoList setRestoreInfo(String restoreInfo) {
            this.restoreInfo = restoreInfo;
            return this;
        }
        public String getRestoreInfo() {
            return this.restoreInfo;
        }

    }

}
