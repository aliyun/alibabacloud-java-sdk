// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListSummariesResponseBody extends TeaModel {
    @NameInMap("CenterSummary")
    public ListSummariesResponseBodyCenterSummary centerSummary;

    @NameInMap("RegionSummaries")
    public java.util.List<ListSummariesResponseBodyRegionSummaries> regionSummaries;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSummariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSummariesResponseBody self = new ListSummariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSummariesResponseBody setCenterSummary(ListSummariesResponseBodyCenterSummary centerSummary) {
        this.centerSummary = centerSummary;
        return this;
    }
    public ListSummariesResponseBodyCenterSummary getCenterSummary() {
        return this.centerSummary;
    }

    public ListSummariesResponseBody setRegionSummaries(java.util.List<ListSummariesResponseBodyRegionSummaries> regionSummaries) {
        this.regionSummaries = regionSummaries;
        return this;
    }
    public java.util.List<ListSummariesResponseBodyRegionSummaries> getRegionSummaries() {
        return this.regionSummaries;
    }

    public ListSummariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSummariesResponseBodyCenterSummary extends TeaModel {
        @NameInMap("RegisteredResourceTypeCount")
        public Integer registeredResourceTypeCount;

        @NameInMap("TemplateCount")
        public String templateCount;

        public static ListSummariesResponseBodyCenterSummary build(java.util.Map<String, ?> map) throws Exception {
            ListSummariesResponseBodyCenterSummary self = new ListSummariesResponseBodyCenterSummary();
            return TeaModel.build(map, self);
        }

        public ListSummariesResponseBodyCenterSummary setRegisteredResourceTypeCount(Integer registeredResourceTypeCount) {
            this.registeredResourceTypeCount = registeredResourceTypeCount;
            return this;
        }
        public Integer getRegisteredResourceTypeCount() {
            return this.registeredResourceTypeCount;
        }

        public ListSummariesResponseBodyCenterSummary setTemplateCount(String templateCount) {
            this.templateCount = templateCount;
            return this;
        }
        public String getTemplateCount() {
            return this.templateCount;
        }

    }

    public static class ListSummariesResponseBodyRegionSummariesStackDetails extends TeaModel {
        @NameInMap("BriefStatus")
        public String briefStatus;

        @NameInMap("Count")
        public String count;

        public static ListSummariesResponseBodyRegionSummariesStackDetails build(java.util.Map<String, ?> map) throws Exception {
            ListSummariesResponseBodyRegionSummariesStackDetails self = new ListSummariesResponseBodyRegionSummariesStackDetails();
            return TeaModel.build(map, self);
        }

        public ListSummariesResponseBodyRegionSummariesStackDetails setBriefStatus(String briefStatus) {
            this.briefStatus = briefStatus;
            return this;
        }
        public String getBriefStatus() {
            return this.briefStatus;
        }

        public ListSummariesResponseBodyRegionSummariesStackDetails setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

    }

    public static class ListSummariesResponseBodyRegionSummaries extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StackCount")
        public String stackCount;

        @NameInMap("StackDetails")
        public java.util.List<ListSummariesResponseBodyRegionSummariesStackDetails> stackDetails;

        @NameInMap("StackGroupCount")
        public String stackGroupCount;

        @NameInMap("TemplateScratchCount")
        public Integer templateScratchCount;

        public static ListSummariesResponseBodyRegionSummaries build(java.util.Map<String, ?> map) throws Exception {
            ListSummariesResponseBodyRegionSummaries self = new ListSummariesResponseBodyRegionSummaries();
            return TeaModel.build(map, self);
        }

        public ListSummariesResponseBodyRegionSummaries setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListSummariesResponseBodyRegionSummaries setStackCount(String stackCount) {
            this.stackCount = stackCount;
            return this;
        }
        public String getStackCount() {
            return this.stackCount;
        }

        public ListSummariesResponseBodyRegionSummaries setStackDetails(java.util.List<ListSummariesResponseBodyRegionSummariesStackDetails> stackDetails) {
            this.stackDetails = stackDetails;
            return this;
        }
        public java.util.List<ListSummariesResponseBodyRegionSummariesStackDetails> getStackDetails() {
            return this.stackDetails;
        }

        public ListSummariesResponseBodyRegionSummaries setStackGroupCount(String stackGroupCount) {
            this.stackGroupCount = stackGroupCount;
            return this;
        }
        public String getStackGroupCount() {
            return this.stackGroupCount;
        }

        public ListSummariesResponseBodyRegionSummaries setTemplateScratchCount(Integer templateScratchCount) {
            this.templateScratchCount = templateScratchCount;
            return this;
        }
        public Integer getTemplateScratchCount() {
            return this.templateScratchCount;
        }

    }

}
