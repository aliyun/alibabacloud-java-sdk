// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppStreamingOutTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>Application ID, created and queried through the console. Only a single ID is supported.</p>
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
     * <p>Page number. By default, page 1 is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of entries per page. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAppStreamingOutTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStreamingOutTemplatesShrinkRequest self = new DescribeAppStreamingOutTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppStreamingOutTemplatesShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppStreamingOutTemplatesShrinkRequest setConditionShrink(String conditionShrink) {
        this.conditionShrink = conditionShrink;
        return this;
    }
    public String getConditionShrink() {
        return this.conditionShrink;
    }

    public DescribeAppStreamingOutTemplatesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeAppStreamingOutTemplatesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
