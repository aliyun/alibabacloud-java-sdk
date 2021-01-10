// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmChartReleaseResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ChartResourceStatuses")
    public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses> chartResourceStatuses;

    public static GetAKSHelmChartReleaseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmChartReleaseResourceResponseBody self = new GetAKSHelmChartReleaseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmChartReleaseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmChartReleaseResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmChartReleaseResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmChartReleaseResourceResponseBody setChartResourceStatuses(java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses> chartResourceStatuses) {
        this.chartResourceStatuses = chartResourceStatuses;
        return this;
    }
    public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses> getChartResourceStatuses() {
        return this.chartResourceStatuses;
    }

    public static class GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        public static GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList self = new GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems extends TeaModel {
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ColumnList")
        public java.util.List<String> columnList;

        @NameInMap("DataList")
        public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList> dataList;

        public static GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems self = new GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems setColumnList(java.util.List<String> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems setDataList(java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItemsDataList> getDataList() {
            return this.dataList;
        }

    }

    public static class GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses extends TeaModel {
        @NameInMap("ChartName")
        public String chartName;

        @NameInMap("ChartVersion")
        public String chartVersion;

        @NameInMap("ChartResourceItems")
        public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems> chartResourceItems;

        public static GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses build(java.util.Map<String, ?> map) throws Exception {
            GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses self = new GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses();
            return TeaModel.build(map, self);
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses setChartVersion(String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }
        public String getChartVersion() {
            return this.chartVersion;
        }

        public GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatuses setChartResourceItems(java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems> chartResourceItems) {
            this.chartResourceItems = chartResourceItems;
            return this;
        }
        public java.util.List<GetAKSHelmChartReleaseResourceResponseBodyChartResourceStatusesChartResourceItems> getChartResourceItems() {
            return this.chartResourceItems;
        }

    }

}
