// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListTagResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTagResponseBodyData> data;

    /**
     * <p>The actual number of records returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DataSize")
    public Integer dataSize;

    /**
     * <p>The error message, if any.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. true: The call was successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResponseBody self = new ListTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTagResponseBody setData(java.util.List<ListTagResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTagResponseBodyData> getData() {
        return this.data;
    }

    public ListTagResponseBody setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Integer getDataSize() {
        return this.dataSize;
    }

    public ListTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagResponseBodyData extends TeaModel {
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
         * <p>The node path.</p>
         */
        @NameInMap("Path")
        public java.util.List<String> path;

        /**
         * <p>The label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        public static ListTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagResponseBodyData self = new ListTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagResponseBodyData setChildCount(Integer childCount) {
            this.childCount = childCount;
            return this;
        }
        public Integer getChildCount() {
            return this.childCount;
        }

        public ListTagResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTagResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTagResponseBodyData setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListTagResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListTagResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTagResponseBodyData setParentTagId(Long parentTagId) {
            this.parentTagId = parentTagId;
            return this;
        }
        public Long getParentTagId() {
            return this.parentTagId;
        }

        public ListTagResponseBodyData setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

        public ListTagResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

    }

}
