// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafTagListResponseBody extends TeaModel {
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
     * <p>Page size, default value is 10.</p>
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
    public java.util.List<DescribeSafTagListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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

    public static DescribeSafTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafTagListResponseBody self = new DescribeSafTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafTagListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSafTagListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSafTagListResponseBody setResultObject(java.util.List<DescribeSafTagListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSafTagListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSafTagListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSafTagListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSafTagListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>依赖IP画像模型识别输出风险高、中高、中的判定\n数据来源主要基于IP的网络属性数据和对黑产行为轨迹的情报监控数据，涵盖可识别检测IP网络属性特征、恶意属性等特征\n而模型评分的高中低主要是根据当前IP号段命中风险行为的恶意程度和种类来判定的\n备注：以下rn0311、rn0312、rn0313、rn0314、rn0315属于IP画像模型针对当前请求IP识别出的风险类别</p>
         */
        @NameInMap("tagDesc")
        public String tagDesc;

        /**
         * <p>Tag meaning.</p>
         * 
         * <strong>example:</strong>
         * <p>IP风险评分高</p>
         */
        @NameInMap("tagMean")
        public String tagMean;

        /**
         * <p>Tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>rn0301</p>
         */
        @NameInMap("tagName")
        public String tagName;

        /**
         * <p>Tag identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>rn0301</p>
         */
        @NameInMap("tagState")
        public String tagState;

        /**
         * <p>Tag type.</p>
         * 
         * <strong>example:</strong>
         * <p>IP风险类</p>
         */
        @NameInMap("tagType")
        public String tagType;

        /**
         * <p>Unique identifier of the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>rn0301</p>
         */
        @NameInMap("tagUid")
        public String tagUid;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1684744034000</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static DescribeSafTagListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafTagListResponseBodyResultObject self = new DescribeSafTagListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafTagListResponseBodyResultObject setTagDesc(String tagDesc) {
            this.tagDesc = tagDesc;
            return this;
        }
        public String getTagDesc() {
            return this.tagDesc;
        }

        public DescribeSafTagListResponseBodyResultObject setTagMean(String tagMean) {
            this.tagMean = tagMean;
            return this;
        }
        public String getTagMean() {
            return this.tagMean;
        }

        public DescribeSafTagListResponseBodyResultObject setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public DescribeSafTagListResponseBodyResultObject setTagState(String tagState) {
            this.tagState = tagState;
            return this;
        }
        public String getTagState() {
            return this.tagState;
        }

        public DescribeSafTagListResponseBodyResultObject setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

        public DescribeSafTagListResponseBodyResultObject setTagUid(String tagUid) {
            this.tagUid = tagUid;
            return this;
        }
        public String getTagUid() {
            return this.tagUid;
        }

        public DescribeSafTagListResponseBodyResultObject setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
