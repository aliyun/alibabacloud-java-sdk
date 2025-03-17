// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetWorksEmbedListResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>38C0F*<strong><strong>0-415</strong></strong>9F1-*****422BDB65</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Array of report objects</p>
     */
    @NameInMap("Result")
    public GetWorksEmbedListResponseBodyResult result;

    /**
     * <p>Whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetWorksEmbedListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorksEmbedListResponseBody self = new GetWorksEmbedListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorksEmbedListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorksEmbedListResponseBody setResult(GetWorksEmbedListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWorksEmbedListResponseBodyResult getResult() {
        return this.result;
    }

    public GetWorksEmbedListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorksEmbedListResponseBodyResultData extends TeaModel {
        /**
         * <p>Embed time</p>
         * 
         * <strong>example:</strong>
         * <p>YYYY-mm-DD hh:MM:ss</p>
         */
        @NameInMap("EmbedTime")
        public String embedTime;

        /**
         * <p>Report ID</p>
         * 
         * <strong>example:</strong>
         * <p>897ce25e-<strong><strong>-</strong></strong>-af84-d13c5610****</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <p>Report name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorksName")
        public String worksName;

        /**
         * <p>Report type</p>
         * 
         * <strong>example:</strong>
         * <p>page</p>
         */
        @NameInMap("WorksType")
        public String worksType;

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>87c6b145-<strong><strong>-43e1-9426-8f93be23</strong></strong></p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetWorksEmbedListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GetWorksEmbedListResponseBodyResultData self = new GetWorksEmbedListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GetWorksEmbedListResponseBodyResultData setEmbedTime(String embedTime) {
            this.embedTime = embedTime;
            return this;
        }
        public String getEmbedTime() {
            return this.embedTime;
        }

        public GetWorksEmbedListResponseBodyResultData setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public GetWorksEmbedListResponseBodyResultData setWorksName(String worksName) {
            this.worksName = worksName;
            return this;
        }
        public String getWorksName() {
            return this.worksName;
        }

        public GetWorksEmbedListResponseBodyResultData setWorksType(String worksType) {
            this.worksType = worksType;
            return this;
        }
        public String getWorksType() {
            return this.worksType;
        }

        public GetWorksEmbedListResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetWorksEmbedListResponseBodyResult extends TeaModel {
        /**
         * <p>Array of reports</p>
         */
        @NameInMap("Data")
        public java.util.List<GetWorksEmbedListResponseBodyResultData> data;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>Number of items per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("TotalNum")
        public Long totalNum;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalPages")
        public Long totalPages;

        public static GetWorksEmbedListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWorksEmbedListResponseBodyResult self = new GetWorksEmbedListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWorksEmbedListResponseBodyResult setData(java.util.List<GetWorksEmbedListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetWorksEmbedListResponseBodyResultData> getData() {
            return this.data;
        }

        public GetWorksEmbedListResponseBodyResult setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetWorksEmbedListResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetWorksEmbedListResponseBodyResult setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public GetWorksEmbedListResponseBodyResult setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

    }

}
