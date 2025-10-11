// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    @NameInMap("DBRevisionVersionList")
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList> DBRevisionVersionList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBMiniEngineVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBMiniEngineVersionsResponseBody self = new DescribeDBMiniEngineVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBMiniEngineVersionsResponseBody setDBRevisionVersionList(java.util.List<DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList> DBRevisionVersionList) {
        this.DBRevisionVersionList = DBRevisionVersionList;
        return this;
    }
    public java.util.List<DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList> getDBRevisionVersionList() {
        return this.DBRevisionVersionList;
    }

    public DescribeDBMiniEngineVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ReleaseNote</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        @NameInMap("ReleaseType")
        public String releaseType;

        /**
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        @NameInMap("RevisionVersionCode")
        public String revisionVersionCode;

        /**
         * <strong>example:</strong>
         * <p>8.0.1.1.35.1</p>
         */
        @NameInMap("RevisionVersionName")
        public String revisionVersionName;

        public static DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList self = new DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList();
            return TeaModel.build(map, self);
        }

        public DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList setRevisionVersionCode(String revisionVersionCode) {
            this.revisionVersionCode = revisionVersionCode;
            return this;
        }
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        public DescribeDBMiniEngineVersionsResponseBodyDBRevisionVersionList setRevisionVersionName(String revisionVersionName) {
            this.revisionVersionName = revisionVersionName;
            return this;
        }
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

    }

}
