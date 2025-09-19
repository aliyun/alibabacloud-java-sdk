// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVersionPageListResponseBody extends TeaModel {
    /**
     * <p>The maximum amount of data to be read in this call, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>用来表示当前调用返回读取到的位置。空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Number of items per page, with a default value of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeVersionPageListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeVersionPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionPageListResponseBody self = new DescribeVersionPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionPageListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVersionPageListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVersionPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVersionPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVersionPageListResponseBody setResultObject(java.util.List<DescribeVersionPageListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeVersionPageListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeVersionPageListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeVersionPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeVersionPageListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Change content.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;description\&quot;:\&quot;自定义变量\&quot;,\&quot;expression\&quot;:\&quot;1\&quot;,\&quot;expressionTitle\&quot;:\&quot;1\&quot;,\&quot;expressionVariable\&quot;:\&quot;\&quot;,\&quot;fieldRank\&quot;:0,\&quot;id\&quot;:392023,\&quot;name\&quot;:\&quot;ex_OERlw0Zqfb23\&quot;,\&quot;outlier\&quot;:\&quot;SYS_ERROR\&quot;,\&quot;outputs\&quot;:\&quot;STRING\&quot;,\&quot;refObjId\&quot;:\&quot;de_auevox0336\&quot;,\&quot;region\&quot;:\&quot;SH\&quot;,\&quot;title\&quot;:\&quot;自定义变量\&quot;,\&quot;version\&quot;:4}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Creator.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>Variable description.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1565701886000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>Primary key ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>808</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <p>Name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_OERlw0Zqfb23</p>
         */
        @NameInMap("objectCode")
        public String objectCode;

        /**
         * <p>Primary key ID of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>392023</p>
         */
        @NameInMap("objectId")
        public Long objectId;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Variable type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>151222222222226</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static DescribeVersionPageListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionPageListResponseBodyResultObject self = new DescribeVersionPageListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVersionPageListResponseBodyResultObject setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeVersionPageListResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeVersionPageListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVersionPageListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeVersionPageListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVersionPageListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVersionPageListResponseBodyResultObject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeVersionPageListResponseBodyResultObject setObjectCode(String objectCode) {
            this.objectCode = objectCode;
            return this;
        }
        public String getObjectCode() {
            return this.objectCode;
        }

        public DescribeVersionPageListResponseBodyResultObject setObjectId(Long objectId) {
            this.objectId = objectId;
            return this;
        }
        public Long getObjectId() {
            return this.objectId;
        }

        public DescribeVersionPageListResponseBodyResultObject setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVersionPageListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVersionPageListResponseBodyResultObject setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public DescribeVersionPageListResponseBodyResultObject setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
