// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeStoragePoolInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeStoragePoolInfoResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStoragePoolInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePoolInfoResponseBody self = new DescribeStoragePoolInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePoolInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStoragePoolInfoResponseBody setData(DescribeStoragePoolInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeStoragePoolInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeStoragePoolInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeStoragePoolInfoResponseBodyDataStoragePools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <strong>example:</strong>
         * <p>[pxc-xdb-s-pxcbj<strong><strong>xxnwp0wac2c4\&quot;,\&quot;pxc-xdb-s-pxcbjr3b8</strong></strong>p0wa1589\&quot;]</p>
         */
        @NameInMap("DnIdList")
        public java.util.List<String> dnIdList;

        /**
         * <p>DN id</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xdb-s-pxcshr****rh7fn2654fc</p>
         */
        @NameInMap("DnIdString")
        public String dnIdString;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;appId\&quot;:\&quot;APP_ETLUP1E5FMI5ND5IFO8W\&quot;}</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>2025-08-27 23:19:52.0</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-09-02 16:52:47.0</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("IdleDNIdList")
        public java.util.List<String> idleDNIdList;

        /**
         * <strong>example:</strong>
         * <p>test-cacheapi</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>pxc-xdb-s-hzr*****6j4se284344</p>
         */
        @NameInMap("UnDeletableDNId")
        public String unDeletableDNId;

        public static DescribeStoragePoolInfoResponseBodyDataStoragePools build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePoolInfoResponseBodyDataStoragePools self = new DescribeStoragePoolInfoResponseBodyDataStoragePools();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setDnIdList(java.util.List<String> dnIdList) {
            this.dnIdList = dnIdList;
            return this;
        }
        public java.util.List<String> getDnIdList() {
            return this.dnIdList;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setDnIdString(String dnIdString) {
            this.dnIdString = dnIdString;
            return this;
        }
        public String getDnIdString() {
            return this.dnIdString;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setIdleDNIdList(java.util.List<String> idleDNIdList) {
            this.idleDNIdList = idleDNIdList;
            return this;
        }
        public java.util.List<String> getIdleDNIdList() {
            return this.idleDNIdList;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStoragePoolInfoResponseBodyDataStoragePools setUnDeletableDNId(String unDeletableDNId) {
            this.unDeletableDNId = unDeletableDNId;
            return this;
        }
        public String getUnDeletableDNId() {
            return this.unDeletableDNId;
        }

    }

    public static class DescribeStoragePoolInfoResponseBodyData extends TeaModel {
        @NameInMap("StoragePools")
        public java.util.List<DescribeStoragePoolInfoResponseBodyDataStoragePools> storagePools;

        public static DescribeStoragePoolInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStoragePoolInfoResponseBodyData self = new DescribeStoragePoolInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStoragePoolInfoResponseBodyData setStoragePools(java.util.List<DescribeStoragePoolInfoResponseBodyDataStoragePools> storagePools) {
            this.storagePools = storagePools;
            return this;
        }
        public java.util.List<DescribeStoragePoolInfoResponseBodyDataStoragePools> getStoragePools() {
            return this.storagePools;
        }

    }

}
