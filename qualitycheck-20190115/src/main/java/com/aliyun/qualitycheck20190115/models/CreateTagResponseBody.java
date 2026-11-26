// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTagResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success, whereas other values indicate failure. You can determine the cause of the failure based on this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateTagResponseBodyData data;

    /**
     * <p>The error message returned if an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResponseBody self = new CreateTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTagResponseBody setData(CreateTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTagResponseBodyData getData() {
        return this.data;
    }

    public CreateTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTagResponseBodyData extends TeaModel {
        /**
         * <p>The time when the tag node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1748428991000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to aggregate all intents and FAQs related to after-sales service</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the tag node was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1748428991000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>After-sales issue</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parent tag node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentTagId")
        public Long parentTagId;

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        public static CreateTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTagResponseBodyData self = new CreateTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTagResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateTagResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateTagResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTagResponseBodyData setParentTagId(Long parentTagId) {
            this.parentTagId = parentTagId;
            return this;
        }
        public Long getParentTagId() {
            return this.parentTagId;
        }

        public CreateTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

    }

}
