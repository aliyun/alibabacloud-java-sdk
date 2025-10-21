// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListTopicResponseBody extends TeaModel {
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

    @NameInMap("TopicInfoList")
    public java.util.List<ListTopicResponseBodyTopicInfoList> topicInfoList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicResponseBody self = new ListTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopicResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTopicResponseBody setTopicInfoList(java.util.List<ListTopicResponseBodyTopicInfoList> topicInfoList) {
        this.topicInfoList = topicInfoList;
        return this;
    }
    public java.util.List<ListTopicResponseBodyTopicInfoList> getTopicInfoList() {
        return this.topicInfoList;
    }

    public ListTopicResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTopicResponseBodyTopicInfoListPolicyInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>412</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>bqi1c3s99qx3</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        @NameInMap("PolicyName")
        public String policyName;

        public static ListTopicResponseBodyTopicInfoListPolicyInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListTopicResponseBodyTopicInfoListPolicyInfoList self = new ListTopicResponseBodyTopicInfoListPolicyInfoList();
            return TeaModel.build(map, self);
        }

        public ListTopicResponseBodyTopicInfoListPolicyInfoList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public ListTopicResponseBodyTopicInfoListPolicyInfoList setPolicyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        public ListTopicResponseBodyTopicInfoListPolicyInfoList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class ListTopicResponseBodyTopicInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1597738932000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("PolicyInfoList")
        public java.util.List<ListTopicResponseBodyTopicInfoListPolicyInfoList> policyInfoList;

        @NameInMap("TopicDefinition")
        public String topicDefinition;

        /**
         * <strong>example:</strong>
         * <p>216</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicName")
        public String topicName;

        public static ListTopicResponseBodyTopicInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListTopicResponseBodyTopicInfoList self = new ListTopicResponseBodyTopicInfoList();
            return TeaModel.build(map, self);
        }

        public ListTopicResponseBodyTopicInfoList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTopicResponseBodyTopicInfoList setPolicyInfoList(java.util.List<ListTopicResponseBodyTopicInfoListPolicyInfoList> policyInfoList) {
            this.policyInfoList = policyInfoList;
            return this;
        }
        public java.util.List<ListTopicResponseBodyTopicInfoListPolicyInfoList> getPolicyInfoList() {
            return this.policyInfoList;
        }

        public ListTopicResponseBodyTopicInfoList setTopicDefinition(String topicDefinition) {
            this.topicDefinition = topicDefinition;
            return this;
        }
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        public ListTopicResponseBodyTopicInfoList setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListTopicResponseBodyTopicInfoList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

}
