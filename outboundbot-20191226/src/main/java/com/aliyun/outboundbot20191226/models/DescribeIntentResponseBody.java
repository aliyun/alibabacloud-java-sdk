// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the intent.</p>
     */
    @NameInMap("Intent")
    public DescribeIntentResponseBodyIntent intent;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>327FEE69-F173-5B2F-9F3B-DCC6182D7BA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponseBody self = new DescribeIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIntentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeIntentResponseBody setIntent(DescribeIntentResponseBodyIntent intent) {
        this.intent = intent;
        return this;
    }
    public DescribeIntentResponseBodyIntent getIntent() {
        return this.intent;
    }

    public DescribeIntentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeIntentResponseBodyIntent extends TeaModel {
        /**
         * <p>The time when the intent was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1578469042851</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>同意还款意图</p>
         */
        @NameInMap("IntentDescription")
        public String intentDescription;

        /**
         * <p>The ID of the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>10722701</p>
         */
        @NameInMap("IntentId")
        public String intentId;

        /**
         * <p>The name of the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>统一还款</p>
         */
        @NameInMap("IntentName")
        public String intentName;

        /**
         * <p>The keywords for the intent. You can use these keywords to filter intents during list operations.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;还款&quot;]</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>The ID of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>6ef95fd5-558f-4ee8-af34-b2ede087a87c</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The time when the intent was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1578469042851</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>A list of utterances that trigger the intent.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ok&quot;,&quot;好的&quot;,&quot;好吧&quot;,&quot;好嘞&quot;,&quot;可以&quot;,&quot;行啊&quot;,&quot;行吧&quot;,&quot;那行&quot;,&quot;知道了&quot;,&quot;我看一下&quot;,&quot;能的&quot;,&quot;等会吧&quot;,&quot;等一下&quot;,&quot;马上还&quot;,&quot;等一会&quot;,&quot;过两天&quot;,&quot;我会想办法处理&quot;]</p>
         */
        @NameInMap("Utterances")
        public String utterances;

        public static DescribeIntentResponseBodyIntent build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodyIntent self = new DescribeIntentResponseBodyIntent();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodyIntent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeIntentResponseBodyIntent setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public DescribeIntentResponseBodyIntent setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public DescribeIntentResponseBodyIntent setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public DescribeIntentResponseBodyIntent setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public DescribeIntentResponseBodyIntent setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeIntentResponseBodyIntent setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeIntentResponseBodyIntent setUtterances(String utterances) {
            this.utterances = utterances;
            return this;
        }
        public String getUtterances() {
            return this.utterances;
        }

    }

}
