// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckCopyRuleVariableResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public CheckCopyRuleVariableResponseBodyResultObject resultObject;

    public static CheckCopyRuleVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCopyRuleVariableResponseBody self = new CheckCopyRuleVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCopyRuleVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCopyRuleVariableResponseBody setResultObject(CheckCopyRuleVariableResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CheckCopyRuleVariableResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CheckCopyRuleVariableResponseBodyResultObjectMessage extends TeaModel {
        /**
         * <p>Primary key ID of the variable</p>
         * 
         * <strong>example:</strong>
         * <p>213</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Name of the variable</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Title of the variable</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Type of the variable</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("Type")
        public String type;

        public static CheckCopyRuleVariableResponseBodyResultObjectMessage build(java.util.Map<String, ?> map) throws Exception {
            CheckCopyRuleVariableResponseBodyResultObjectMessage self = new CheckCopyRuleVariableResponseBodyResultObjectMessage();
            return TeaModel.build(map, self);
        }

        public CheckCopyRuleVariableResponseBodyResultObjectMessage setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CheckCopyRuleVariableResponseBodyResultObjectMessage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CheckCopyRuleVariableResponseBodyResultObjectMessage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CheckCopyRuleVariableResponseBodyResultObjectMessage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CheckCopyRuleVariableResponseBodyResultObject extends TeaModel {
        /**
         * <p>Information.</p>
         */
        @NameInMap("Message")
        public java.util.List<CheckCopyRuleVariableResponseBodyResultObjectMessage> message;

        public static CheckCopyRuleVariableResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CheckCopyRuleVariableResponseBodyResultObject self = new CheckCopyRuleVariableResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CheckCopyRuleVariableResponseBodyResultObject setMessage(java.util.List<CheckCopyRuleVariableResponseBodyResultObjectMessage> message) {
            this.message = message;
            return this;
        }
        public java.util.List<CheckCopyRuleVariableResponseBodyResultObjectMessage> getMessage() {
            return this.message;
        }

    }

}
