// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSupportDbTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TypeList")
    public java.util.List<ListSupportDbTypesResponseBodyTypeList> typeList;

    public static ListSupportDbTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportDbTypesResponseBody self = new ListSupportDbTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportDbTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupportDbTypesResponseBody setTypeList(java.util.List<ListSupportDbTypesResponseBodyTypeList> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<ListSupportDbTypesResponseBodyTypeList> getTypeList() {
        return this.typeList;
    }

    public static class ListSupportDbTypesResponseBodyTypeListDbVersions extends TeaModel {
        @NameInMap("DbVersionName")
        public String dbVersionName;

        @NameInMap("DbVersion")
        public Integer dbVersion;

        public static ListSupportDbTypesResponseBodyTypeListDbVersions build(java.util.Map<String, ?> map) throws Exception {
            ListSupportDbTypesResponseBodyTypeListDbVersions self = new ListSupportDbTypesResponseBodyTypeListDbVersions();
            return TeaModel.build(map, self);
        }

        public ListSupportDbTypesResponseBodyTypeListDbVersions setDbVersionName(String dbVersionName) {
            this.dbVersionName = dbVersionName;
            return this;
        }
        public String getDbVersionName() {
            return this.dbVersionName;
        }

        public ListSupportDbTypesResponseBodyTypeListDbVersions setDbVersion(Integer dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public Integer getDbVersion() {
            return this.dbVersion;
        }

    }

    public static class ListSupportDbTypesResponseBodyTypeList extends TeaModel {
        @NameInMap("DbType")
        public Integer dbType;

        @NameInMap("DbTypeName")
        public String dbTypeName;

        @NameInMap("DbVersions")
        public java.util.List<ListSupportDbTypesResponseBodyTypeListDbVersions> dbVersions;

        public static ListSupportDbTypesResponseBodyTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListSupportDbTypesResponseBodyTypeList self = new ListSupportDbTypesResponseBodyTypeList();
            return TeaModel.build(map, self);
        }

        public ListSupportDbTypesResponseBodyTypeList setDbType(Integer dbType) {
            this.dbType = dbType;
            return this;
        }
        public Integer getDbType() {
            return this.dbType;
        }

        public ListSupportDbTypesResponseBodyTypeList setDbTypeName(String dbTypeName) {
            this.dbTypeName = dbTypeName;
            return this;
        }
        public String getDbTypeName() {
            return this.dbTypeName;
        }

        public ListSupportDbTypesResponseBodyTypeList setDbVersions(java.util.List<ListSupportDbTypesResponseBodyTypeListDbVersions> dbVersions) {
            this.dbVersions = dbVersions;
            return this;
        }
        public java.util.List<ListSupportDbTypesResponseBodyTypeListDbVersions> getDbVersions() {
            return this.dbVersions;
        }

    }

}
