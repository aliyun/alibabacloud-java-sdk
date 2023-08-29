// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewsResponseBody extends TeaModel {
    @NameInMap("FeatureViews")
    public java.util.List<ListFeatureViewsResponseBodyFeatureViews> featureViews;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListFeatureViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewsResponseBody self = new ListFeatureViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewsResponseBody setFeatureViews(java.util.List<ListFeatureViewsResponseBodyFeatureViews> featureViews) {
        this.featureViews = featureViews;
        return this;
    }
    public java.util.List<ListFeatureViewsResponseBodyFeatureViews> getFeatureViews() {
        return this.featureViews;
    }

    public ListFeatureViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureViewsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeatureViewsResponseBodyFeatureViews extends TeaModel {
        @NameInMap("FeatureEntityName")
        public String featureEntityName;

        @NameInMap("FeatureViewId")
        public String featureViewId;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RegisterDatasourceId")
        public String registerDatasourceId;

        @NameInMap("RegisterDatasourceName")
        public String registerDatasourceName;

        @NameInMap("RegisterTable")
        public String registerTable;

        @NameInMap("TTL")
        public Integer TTL;

        @NameInMap("Type")
        public String type;

        public static ListFeatureViewsResponseBodyFeatureViews build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureViewsResponseBodyFeatureViews self = new ListFeatureViewsResponseBodyFeatureViews();
            return TeaModel.build(map, self);
        }

        public ListFeatureViewsResponseBodyFeatureViews setFeatureEntityName(String featureEntityName) {
            this.featureEntityName = featureEntityName;
            return this;
        }
        public String getFeatureEntityName() {
            return this.featureEntityName;
        }

        public ListFeatureViewsResponseBodyFeatureViews setFeatureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }
        public String getFeatureViewId() {
            return this.featureViewId;
        }

        public ListFeatureViewsResponseBodyFeatureViews setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListFeatureViewsResponseBodyFeatureViews setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListFeatureViewsResponseBodyFeatureViews setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFeatureViewsResponseBodyFeatureViews setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListFeatureViewsResponseBodyFeatureViews setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFeatureViewsResponseBodyFeatureViews setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListFeatureViewsResponseBodyFeatureViews setRegisterDatasourceId(String registerDatasourceId) {
            this.registerDatasourceId = registerDatasourceId;
            return this;
        }
        public String getRegisterDatasourceId() {
            return this.registerDatasourceId;
        }

        public ListFeatureViewsResponseBodyFeatureViews setRegisterDatasourceName(String registerDatasourceName) {
            this.registerDatasourceName = registerDatasourceName;
            return this;
        }
        public String getRegisterDatasourceName() {
            return this.registerDatasourceName;
        }

        public ListFeatureViewsResponseBodyFeatureViews setRegisterTable(String registerTable) {
            this.registerTable = registerTable;
            return this;
        }
        public String getRegisterTable() {
            return this.registerTable;
        }

        public ListFeatureViewsResponseBodyFeatureViews setTTL(Integer TTL) {
            this.TTL = TTL;
            return this;
        }
        public Integer getTTL() {
            return this.TTL;
        }

        public ListFeatureViewsResponseBodyFeatureViews setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
