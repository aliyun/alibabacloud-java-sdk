// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricGroupsResponseBody extends TeaModel {
    @NameInMap("ABMetricGroups")
    public java.util.List<ListABMetricGroupsResponseBodyABMetricGroups> ABMetricGroups;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListABMetricGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABMetricGroupsResponseBody self = new ListABMetricGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABMetricGroupsResponseBody setABMetricGroups(java.util.List<ListABMetricGroupsResponseBodyABMetricGroups> ABMetricGroups) {
        this.ABMetricGroups = ABMetricGroups;
        return this;
    }
    public java.util.List<ListABMetricGroupsResponseBodyABMetricGroups> getABMetricGroups() {
        return this.ABMetricGroups;
    }

    public ListABMetricGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABMetricGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListABMetricGroupsResponseBodyABMetricGroups extends TeaModel {
        @NameInMap("ABMetricGroupId")
        public String ABMetricGroupId;

        @NameInMap("ABMetricIds")
        public String ABMetricIds;

        @NameInMap("ABMetricNames")
        public String ABMetricNames;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Realtime")
        public Boolean realtime;

        @NameInMap("SceneId")
        public String sceneId;

        public static ListABMetricGroupsResponseBodyABMetricGroups build(java.util.Map<String, ?> map) throws Exception {
            ListABMetricGroupsResponseBodyABMetricGroups self = new ListABMetricGroupsResponseBodyABMetricGroups();
            return TeaModel.build(map, self);
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setABMetricGroupId(String ABMetricGroupId) {
            this.ABMetricGroupId = ABMetricGroupId;
            return this;
        }
        public String getABMetricGroupId() {
            return this.ABMetricGroupId;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setABMetricIds(String ABMetricIds) {
            this.ABMetricIds = ABMetricIds;
            return this;
        }
        public String getABMetricIds() {
            return this.ABMetricIds;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setABMetricNames(String ABMetricNames) {
            this.ABMetricNames = ABMetricNames;
            return this;
        }
        public String getABMetricNames() {
            return this.ABMetricNames;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setRealtime(Boolean realtime) {
            this.realtime = realtime;
            return this;
        }
        public Boolean getRealtime() {
            return this.realtime;
        }

        public ListABMetricGroupsResponseBodyABMetricGroups setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
