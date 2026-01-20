// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class ReadOutboundTaskCallListShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>张先生</p>
     */
    @NameInMap("CustomerNameOrPhone")
    public String customerNameOrPhone;

    /**
     * <strong>example:</strong>
     * <p>[&quot;1&quot;, &quot;2&quot;]</p>
     */
    @NameInMap("DisplayStatusList")
    public String displayStatusListShrink;

    /**
     * <strong>example:</strong>
     * <p>[&quot;有意向&quot;, &quot;高净值&quot;]</p>
     */
    @NameInMap("LabelTags")
    public String labelTagsShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>51CC272E-D879-1B23-B98E-FCFB072D362B</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ReadOutboundTaskCallListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadOutboundTaskCallListShrinkRequest self = new ReadOutboundTaskCallListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReadOutboundTaskCallListShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ReadOutboundTaskCallListShrinkRequest setCustomerNameOrPhone(String customerNameOrPhone) {
        this.customerNameOrPhone = customerNameOrPhone;
        return this;
    }
    public String getCustomerNameOrPhone() {
        return this.customerNameOrPhone;
    }

    public ReadOutboundTaskCallListShrinkRequest setDisplayStatusListShrink(String displayStatusListShrink) {
        this.displayStatusListShrink = displayStatusListShrink;
        return this;
    }
    public String getDisplayStatusListShrink() {
        return this.displayStatusListShrink;
    }

    public ReadOutboundTaskCallListShrinkRequest setLabelTagsShrink(String labelTagsShrink) {
        this.labelTagsShrink = labelTagsShrink;
        return this;
    }
    public String getLabelTagsShrink() {
        return this.labelTagsShrink;
    }

    public ReadOutboundTaskCallListShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ReadOutboundTaskCallListShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ReadOutboundTaskCallListShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ReadOutboundTaskCallListShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ReadOutboundTaskCallListShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
