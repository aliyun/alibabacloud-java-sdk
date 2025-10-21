// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListPolicyResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If there is an error, returns the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number, consistent with the PageNumber in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, the maximum number of results returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of policy objects.</p>
     */
    @NameInMap("PolicyInfoList")
    public java.util.List<ListPolicyResponseBodyPolicyInfoList> policyInfoList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Possible values are:</p>
     * <ul>
     * <li>True: Call succeeded.</li>
     * <li>False: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyResponseBody self = new ListPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPolicyResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPolicyResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPolicyResponseBody setPolicyInfoList(java.util.List<ListPolicyResponseBodyPolicyInfoList> policyInfoList) {
        this.policyInfoList = policyInfoList;
        return this;
    }
    public java.util.List<ListPolicyResponseBodyPolicyInfoList> getPolicyInfoList() {
        return this.policyInfoList;
    }

    public ListPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPolicyResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPolicyResponseBodyPolicyInfoList extends TeaModel {
        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1731204769000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("IsSidecarPolicy")
        public Integer isSidecarPolicy;

        /**
         * <p>Tag policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>Policy identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>x1bc5xgs4uhx</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        /**
         * <p>Permission policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("SceneType")
        public Integer sceneType;

        public static ListPolicyResponseBodyPolicyInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyInfoList self = new ListPolicyResponseBodyPolicyInfoList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyInfoList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListPolicyResponseBodyPolicyInfoList setIsSidecarPolicy(Integer isSidecarPolicy) {
            this.isSidecarPolicy = isSidecarPolicy;
            return this;
        }
        public Integer getIsSidecarPolicy() {
            return this.isSidecarPolicy;
        }

        public ListPolicyResponseBodyPolicyInfoList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public ListPolicyResponseBodyPolicyInfoList setPolicyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        public ListPolicyResponseBodyPolicyInfoList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public ListPolicyResponseBodyPolicyInfoList setSceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public Integer getSceneType() {
            return this.sceneType;
        }

    }

}
