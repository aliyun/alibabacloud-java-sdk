// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetExperimentsStatisticsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetExperimentsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsStatisticsResponseBody self = new GetExperimentsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentsStatisticsResponseBody setData(java.util.List<GetExperimentsStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetExperimentsStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public GetExperimentsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExperimentsStatisticsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CreateCount")
        public Long createCount;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>16381</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetExperimentsStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentsStatisticsResponseBodyData self = new GetExperimentsStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExperimentsStatisticsResponseBodyData setCreateCount(Long createCount) {
            this.createCount = createCount;
            return this;
        }
        public Long getCreateCount() {
            return this.createCount;
        }

        public GetExperimentsStatisticsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetExperimentsStatisticsResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
