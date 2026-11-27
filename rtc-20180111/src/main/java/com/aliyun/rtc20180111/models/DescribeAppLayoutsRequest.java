// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppLayoutsRequest extends TeaModel {
    /**
     * <p>The application ID. Create and query it using the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("Condition")
    public DescribeAppLayoutsRequestCondition condition;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
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
         * <p>The layout ID.</p>
         * 
         * <strong>example:</strong>
         * <p>167466539798442****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <p>The layout name.</p>
         * 
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
