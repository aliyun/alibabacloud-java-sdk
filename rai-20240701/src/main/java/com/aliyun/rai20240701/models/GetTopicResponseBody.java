// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1634122349000</p>
     */
    @NameInMap("GmtModified")
    public Long gmtModified;

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

    @NameInMap("PolicyInfoList")
    public java.util.List<GetTopicResponseBodyPolicyInfoList> policyInfoList;

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

    @NameInMap("TopicDefinition")
    public String topicDefinition;

    @NameInMap("TopicExampleInfoList")
    public java.util.List<GetTopicResponseBodyTopicExampleInfoList> topicExampleInfoList;

    /**
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTopicResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GetTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicResponseBody setPolicyInfoList(java.util.List<GetTopicResponseBodyPolicyInfoList> policyInfoList) {
        this.policyInfoList = policyInfoList;
        return this;
    }
    public java.util.List<GetTopicResponseBodyPolicyInfoList> getPolicyInfoList() {
        return this.policyInfoList;
    }

    public GetTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicResponseBody setTopicDefinition(String topicDefinition) {
        this.topicDefinition = topicDefinition;
        return this;
    }
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    public GetTopicResponseBody setTopicExampleInfoList(java.util.List<GetTopicResponseBodyTopicExampleInfoList> topicExampleInfoList) {
        this.topicExampleInfoList = topicExampleInfoList;
        return this;
    }
    public java.util.List<GetTopicResponseBodyTopicExampleInfoList> getTopicExampleInfoList() {
        return this.topicExampleInfoList;
    }

    public GetTopicResponseBody setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class GetTopicResponseBodyPolicyInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <strong>example:</strong>
         * <p>x1bc5xgs4uhx</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        @NameInMap("PolicyName")
        public String policyName;

        public static GetTopicResponseBodyPolicyInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyPolicyInfoList self = new GetTopicResponseBodyPolicyInfoList();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyPolicyInfoList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public GetTopicResponseBodyPolicyInfoList setPolicyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        public GetTopicResponseBodyPolicyInfoList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class GetTopicResponseBodyTopicExampleInfoList extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ExampleId")
        public Long exampleId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExampleType")
        public Integer exampleType;

        public static GetTopicResponseBodyTopicExampleInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyTopicExampleInfoList self = new GetTopicResponseBodyTopicExampleInfoList();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyTopicExampleInfoList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTopicResponseBodyTopicExampleInfoList setExampleId(Long exampleId) {
            this.exampleId = exampleId;
            return this;
        }
        public Long getExampleId() {
            return this.exampleId;
        }

        public GetTopicResponseBodyTopicExampleInfoList setExampleType(Integer exampleType) {
            this.exampleType = exampleType;
            return this;
        }
        public Integer getExampleType() {
            return this.exampleType;
        }

    }

}
