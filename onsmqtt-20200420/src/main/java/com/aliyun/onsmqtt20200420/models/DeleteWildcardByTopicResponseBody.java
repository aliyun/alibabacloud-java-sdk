// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteWildcardByTopicResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>200: success.</li>
     * <li>Other values: error codes. For more information, see error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The rule information dataset.</p>
     */
    @NameInMap("Data")
    public DeleteWildcardByTopicResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82B9E503-F4A1-4F30-976F-C6999FF9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteWildcardByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWildcardByTopicResponseBody self = new DeleteWildcardByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWildcardByTopicResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteWildcardByTopicResponseBody setData(DeleteWildcardByTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteWildcardByTopicResponseBodyData getData() {
        return this.data;
    }

    public DeleteWildcardByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWildcardByTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteWildcardByTopicResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the deletion was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The deletion was successful.</li>
         * <li><strong>false</strong>: The deletion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Deleted")
        public String deleted;

        public static DeleteWildcardByTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteWildcardByTopicResponseBodyData self = new DeleteWildcardByTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteWildcardByTopicResponseBodyData setDeleted(String deleted) {
            this.deleted = deleted;
            return this;
        }
        public String getDeleted() {
            return this.deleted;
        }

    }

}
