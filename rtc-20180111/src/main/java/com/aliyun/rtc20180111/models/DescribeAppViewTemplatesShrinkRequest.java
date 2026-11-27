// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppViewTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>Application ID. Create and view it in the console. You can specify only one ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ioeh****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Search condition.</p>
     */
    @NameInMap("Condition")
    public String conditionShrink;

    /**
     * <p>Page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppViewTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppViewTemplatesShrinkRequest self = new DescribeAppViewTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppViewTemplatesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppViewTemplatesShrinkRequest setConditionShrink(String conditionShrink) {
        this.conditionShrink = conditionShrink;
        return this;
    }
    public String getConditionShrink() {
        return this.conditionShrink;
    }

    public DescribeAppViewTemplatesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppViewTemplatesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
