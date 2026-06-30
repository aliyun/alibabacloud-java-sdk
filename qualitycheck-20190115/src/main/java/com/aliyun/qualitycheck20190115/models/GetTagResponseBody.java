// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTagResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of 200 indicates success. Other values indicate failure. You can use this field to determine the cause of a failure.</p>
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
    public GetTagResponseBodyData data;

    /**
     * <p>The error message, if any.</p>
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
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
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

    public static GetTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTagResponseBody self = new GetTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTagResponseBody setData(GetTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTagResponseBodyData getData() {
        return this.data;
    }

    public GetTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTagResponseBodyData extends TeaModel {
        /**
         * <p>The number of direct child nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ChildCount")
        public Integer childCount;

        /**
         * <p>The time when the label was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1748428991000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于归集售后服务相关的所有意图与 FAQ</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The level of the current node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The time when the label was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1748428991000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>售后问题</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the parent label node.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentTagId")
        public Long parentTagId;

        /**
         * <p>The label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        public static GetTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTagResponseBodyData self = new GetTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTagResponseBodyData setChildCount(Integer childCount) {
            this.childCount = childCount;
            return this;
        }
        public Integer getChildCount() {
            return this.childCount;
        }

        public GetTagResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTagResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTagResponseBodyData setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetTagResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetTagResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTagResponseBodyData setParentTagId(Long parentTagId) {
            this.parentTagId = parentTagId;
            return this;
        }
        public Long getParentTagId() {
            return this.parentTagId;
        }

        public GetTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

    }

}
