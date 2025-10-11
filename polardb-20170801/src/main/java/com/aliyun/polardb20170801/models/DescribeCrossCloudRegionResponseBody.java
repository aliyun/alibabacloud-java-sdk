// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudRegionResponseBody extends TeaModel {
    @NameInMap("CrossCloudRegionList")
    public java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionList> crossCloudRegionList;

    /**
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCrossCloudRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudRegionResponseBody self = new DescribeCrossCloudRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudRegionResponseBody setCrossCloudRegionList(java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionList> crossCloudRegionList) {
        this.crossCloudRegionList = crossCloudRegionList;
        return this;
    }
    public java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionList> getCrossCloudRegionList() {
        return this.crossCloudRegionList;
    }

    public DescribeCrossCloudRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-east-3-1</p>
         */
        @NameInMap("CrossCloudZoneId")
        public String crossCloudZoneId;

        /**
         * <strong>example:</strong>
         * <p>cn-east-3-1</p>
         */
        @NameInMap("CrossCloudZoneName")
        public String crossCloudZoneName;

        public static DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList self = new DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList();
            return TeaModel.build(map, self);
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList setCrossCloudZoneId(String crossCloudZoneId) {
            this.crossCloudZoneId = crossCloudZoneId;
            return this;
        }
        public String getCrossCloudZoneId() {
            return this.crossCloudZoneId;
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList setCrossCloudZoneName(String crossCloudZoneName) {
            this.crossCloudZoneName = crossCloudZoneName;
            return this;
        }
        public String getCrossCloudZoneName() {
            return this.crossCloudZoneName;
        }

    }

    public static class DescribeCrossCloudRegionResponseBodyCrossCloudRegionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-east-3</p>
         */
        @NameInMap("CrossCloudRegionId")
        public String crossCloudRegionId;

        /**
         * <strong>example:</strong>
         * <p>cn-east-3</p>
         */
        @NameInMap("CrossCloudRegionName")
        public String crossCloudRegionName;

        @NameInMap("CrossCloudZoneList")
        public java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList> crossCloudZoneList;

        /**
         * <strong>example:</strong>
         * <p>pj-87681rbcef6******</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static DescribeCrossCloudRegionResponseBodyCrossCloudRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossCloudRegionResponseBodyCrossCloudRegionList self = new DescribeCrossCloudRegionResponseBodyCrossCloudRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionList setCrossCloudRegionId(String crossCloudRegionId) {
            this.crossCloudRegionId = crossCloudRegionId;
            return this;
        }
        public String getCrossCloudRegionId() {
            return this.crossCloudRegionId;
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionList setCrossCloudRegionName(String crossCloudRegionName) {
            this.crossCloudRegionName = crossCloudRegionName;
            return this;
        }
        public String getCrossCloudRegionName() {
            return this.crossCloudRegionName;
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionList setCrossCloudZoneList(java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList> crossCloudZoneList) {
            this.crossCloudZoneList = crossCloudZoneList;
            return this;
        }
        public java.util.List<DescribeCrossCloudRegionResponseBodyCrossCloudRegionListCrossCloudZoneList> getCrossCloudZoneList() {
            return this.crossCloudZoneList;
        }

        public DescribeCrossCloudRegionResponseBodyCrossCloudRegionList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
