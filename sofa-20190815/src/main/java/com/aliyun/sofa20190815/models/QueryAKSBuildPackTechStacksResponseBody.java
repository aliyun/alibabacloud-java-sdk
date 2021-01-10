// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStacksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("List")
    public java.util.List<QueryAKSBuildPackTechStacksResponseBodyList> list;

    public static QueryAKSBuildPackTechStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStacksResponseBody self = new QueryAKSBuildPackTechStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAKSBuildPackTechStacksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAKSBuildPackTechStacksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryAKSBuildPackTechStacksResponseBody setList(java.util.List<QueryAKSBuildPackTechStacksResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryAKSBuildPackTechStacksResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryAKSBuildPackTechStacksResponseBodyList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryAKSBuildPackTechStacksResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryAKSBuildPackTechStacksResponseBodyList self = new QueryAKSBuildPackTechStacksResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public QueryAKSBuildPackTechStacksResponseBodyList setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

}
