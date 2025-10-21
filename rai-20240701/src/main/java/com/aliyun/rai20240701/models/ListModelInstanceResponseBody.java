// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListModelInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("ModelInstanceInfoList")
    public java.util.List<ListModelInstanceResponseBodyModelInstanceInfoList> modelInstanceInfoList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelInstanceResponseBody self = new ListModelInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelInstanceResponseBody setModelInstanceInfoList(java.util.List<ListModelInstanceResponseBodyModelInstanceInfoList> modelInstanceInfoList) {
        this.modelInstanceInfoList = modelInstanceInfoList;
        return this;
    }
    public java.util.List<ListModelInstanceResponseBodyModelInstanceInfoList> getModelInstanceInfoList() {
        return this.modelInstanceInfoList;
    }

    public ListModelInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelInstanceResponseBodyModelInstanceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>torch_rank_v1</p>
         */
        @NameInMap("EasServiceName")
        public String easServiceName;

        /**
         * <strong>example:</strong>
         * <p>1749450490000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSupportContentSafe")
        public Integer isSupportContentSafe;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsSupportImage")
        public Boolean isSupportImage;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsSupportPromptAttack")
        public Integer isSupportPromptAttack;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSupportSensitiveTopic")
        public Integer isSupportSensitiveTopic;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsSupportText")
        public Boolean isSupportText;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ModelInstanceId")
        public Long modelInstanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModelSource")
        public Integer modelSource;

        /**
         * <strong>example:</strong>
         * <p>608226</p>
         */
        @NameInMap("WorkspaceId")
        public Long workspaceId;

        public static ListModelInstanceResponseBodyModelInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListModelInstanceResponseBodyModelInstanceInfoList self = new ListModelInstanceResponseBodyModelInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setEasServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }
        public String getEasServiceName() {
            return this.easServiceName;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setIsSupportContentSafe(Integer isSupportContentSafe) {
            this.isSupportContentSafe = isSupportContentSafe;
            return this;
        }
        public Integer getIsSupportContentSafe() {
            return this.isSupportContentSafe;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setIsSupportImage(Boolean isSupportImage) {
            this.isSupportImage = isSupportImage;
            return this;
        }
        public Boolean getIsSupportImage() {
            return this.isSupportImage;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setIsSupportPromptAttack(Integer isSupportPromptAttack) {
            this.isSupportPromptAttack = isSupportPromptAttack;
            return this;
        }
        public Integer getIsSupportPromptAttack() {
            return this.isSupportPromptAttack;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setIsSupportSensitiveTopic(Integer isSupportSensitiveTopic) {
            this.isSupportSensitiveTopic = isSupportSensitiveTopic;
            return this;
        }
        public Integer getIsSupportSensitiveTopic() {
            return this.isSupportSensitiveTopic;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setIsSupportText(Boolean isSupportText) {
            this.isSupportText = isSupportText;
            return this;
        }
        public Boolean getIsSupportText() {
            return this.isSupportText;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setModelInstanceId(Long modelInstanceId) {
            this.modelInstanceId = modelInstanceId;
            return this;
        }
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setModelSource(Integer modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public Integer getModelSource() {
            return this.modelSource;
        }

        public ListModelInstanceResponseBodyModelInstanceInfoList setWorkspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
