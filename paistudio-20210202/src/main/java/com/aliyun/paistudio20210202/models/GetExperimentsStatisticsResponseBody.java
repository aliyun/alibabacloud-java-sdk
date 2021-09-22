// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetExperimentsStatisticsResponseBodyData> data;

    public static GetExperimentsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsStatisticsResponseBody self = new GetExperimentsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentsStatisticsResponseBody setData(java.util.List<GetExperimentsStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetExperimentsStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetExperimentsStatisticsResponseBodyData extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("CreateCount")
        public Long createCount;

        public static GetExperimentsStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentsStatisticsResponseBodyData self = new GetExperimentsStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentsStatisticsResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetExperimentsStatisticsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetExperimentsStatisticsResponseBodyData setCreateCount(Long createCount) {
            this.createCount = createCount;
            return this;
        }
        public Long getCreateCount() {
            return this.createCount;
        }

    }

}
