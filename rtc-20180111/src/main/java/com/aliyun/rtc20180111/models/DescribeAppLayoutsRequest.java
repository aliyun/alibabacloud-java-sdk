// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLayoutsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Condition")
    public DescribeAppLayoutsRequestCondition condition;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppLayoutsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppLayoutsRequest self = new DescribeAppLayoutsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppLayoutsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppLayoutsRequest setCondition(DescribeAppLayoutsRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public DescribeAppLayoutsRequestCondition getCondition() {
        return this.condition;
    }

    public DescribeAppLayoutsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppLayoutsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeAppLayoutsRequestCondition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>167466539798442****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeAppLayoutsRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppLayoutsRequestCondition self = new DescribeAppLayoutsRequestCondition();
            return TeaModel.build(map, self);
        }

        public DescribeAppLayoutsRequestCondition setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeAppLayoutsRequestCondition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
