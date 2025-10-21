// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListWordGroupResponseBody extends TeaModel {
    /**
     * <p>Status code, 00000 indicates success; other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If an error occurs, returns the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, the maximum number of results returned per page.
     * Maximum limit: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE2558EC-A9EA-5276-ADB5-107B09CF3D11</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful: true means the call was successful; false means the call failed.</p>
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

    /**
     * <p>List of keyword group objects.</p>
     */
    @NameInMap("WordGroupInfoList")
    public java.util.List<ListWordGroupResponseBodyWordGroupInfoList> wordGroupInfoList;

    public static ListWordGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWordGroupResponseBody self = new ListWordGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWordGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWordGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListWordGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWordGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWordGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWordGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWordGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWordGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWordGroupResponseBody setWordGroupInfoList(java.util.List<ListWordGroupResponseBodyWordGroupInfoList> wordGroupInfoList) {
        this.wordGroupInfoList = wordGroupInfoList;
        return this;
    }
    public java.util.List<ListWordGroupResponseBodyWordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public static class ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList extends TeaModel {
        /**
         * <p>Detection policy ID.</p>
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
         * <p>mai934jhuekf</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        /**
         * <p>Detection policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPoliy</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        public static ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList self = new ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList();
            return TeaModel.build(map, self);
        }

        public ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList setPolicyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        public ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class ListWordGroupResponseBodyWordGroupInfoList extends TeaModel {
        /**
         * <p>Policy modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1673578650000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Keyword group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>Keyword group name.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>List of associated policy objects.</p>
         */
        @NameInMap("PolicyInfoList")
        public java.util.List<ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList> policyInfoList;

        public static ListWordGroupResponseBodyWordGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListWordGroupResponseBodyWordGroupInfoList self = new ListWordGroupResponseBodyWordGroupInfoList();
            return TeaModel.build(map, self);
        }

        public ListWordGroupResponseBodyWordGroupInfoList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWordGroupResponseBodyWordGroupInfoList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListWordGroupResponseBodyWordGroupInfoList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListWordGroupResponseBodyWordGroupInfoList setPolicyInfoList(java.util.List<ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList> policyInfoList) {
            this.policyInfoList = policyInfoList;
            return this;
        }
        public java.util.List<ListWordGroupResponseBodyWordGroupInfoListPolicyInfoList> getPolicyInfoList() {
            return this.policyInfoList;
        }

    }

}
