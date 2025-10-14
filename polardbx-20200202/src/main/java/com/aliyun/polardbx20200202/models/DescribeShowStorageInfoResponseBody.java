// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeShowStorageInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeShowStorageInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeShowStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShowStorageInfoResponseBody self = new DescribeShowStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShowStorageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeShowStorageInfoResponseBody setData(DescribeShowStorageInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeShowStorageInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeShowStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeShowStorageInfoResponseBodyDataStorageInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DbCount")
        public Long dbCount;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GroupCount")
        public Long groupCount;

        /**
         * <strong>example:</strong>
         * <p>MASTER</p>
         */
        @NameInMap("InstKind")
        public String instKind;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHealthy")
        public Boolean isHealthy;

        /**
         * <strong>example:</strong>
         * <p>11.117.237.205:3029</p>
         */
        @NameInMap("LeaderNode")
        public String leaderNode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>pxc-xdb-m-pxcbjrylg49skcxb17394</p>
         */
        @NameInMap("StorageInstName")
        public String storageInstName;

        public static DescribeShowStorageInfoResponseBodyDataStorageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowStorageInfoResponseBodyDataStorageInfos self = new DescribeShowStorageInfoResponseBodyDataStorageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setDbCount(Long dbCount) {
            this.dbCount = dbCount;
            return this;
        }
        public Long getDbCount() {
            return this.dbCount;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setInstKind(String instKind) {
            this.instKind = instKind;
            return this;
        }
        public String getInstKind() {
            return this.instKind;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setIsHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            return this;
        }
        public Boolean getIsHealthy() {
            return this.isHealthy;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setLeaderNode(String leaderNode) {
            this.leaderNode = leaderNode;
            return this;
        }
        public String getLeaderNode() {
            return this.leaderNode;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeShowStorageInfoResponseBodyDataStorageInfos setStorageInstName(String storageInstName) {
            this.storageInstName = storageInstName;
            return this;
        }
        public String getStorageInstName() {
            return this.storageInstName;
        }

    }

    public static class DescribeShowStorageInfoResponseBodyData extends TeaModel {
        @NameInMap("StorageInfos")
        public java.util.List<DescribeShowStorageInfoResponseBodyDataStorageInfos> storageInfos;

        public static DescribeShowStorageInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowStorageInfoResponseBodyData self = new DescribeShowStorageInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeShowStorageInfoResponseBodyData setStorageInfos(java.util.List<DescribeShowStorageInfoResponseBodyDataStorageInfos> storageInfos) {
            this.storageInfos = storageInfos;
            return this;
        }
        public java.util.List<DescribeShowStorageInfoResponseBodyDataStorageInfos> getStorageInfos() {
            return this.storageInfos;
        }

    }

}
