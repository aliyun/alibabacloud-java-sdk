// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class ReadOutboundTaskCallListRequest extends TeaModel {
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
    public java.util.List<String> displayStatusList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;有意向&quot;, &quot;高净值&quot;]</p>
     */
    @NameInMap("LabelTags")
    public java.util.List<String> labelTags;

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

    public static ReadOutboundTaskCallListRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadOutboundTaskCallListRequest self = new ReadOutboundTaskCallListRequest();
        return TeaModel.build(map, self);
    }

    public ReadOutboundTaskCallListRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ReadOutboundTaskCallListRequest setCustomerNameOrPhone(String customerNameOrPhone) {
        this.customerNameOrPhone = customerNameOrPhone;
        return this;
    }
    public String getCustomerNameOrPhone() {
        return this.customerNameOrPhone;
    }

    public ReadOutboundTaskCallListRequest setDisplayStatusList(java.util.List<String> displayStatusList) {
        this.displayStatusList = displayStatusList;
        return this;
    }
    public java.util.List<String> getDisplayStatusList() {
        return this.displayStatusList;
    }

    public ReadOutboundTaskCallListRequest setLabelTags(java.util.List<String> labelTags) {
        this.labelTags = labelTags;
        return this;
    }
    public java.util.List<String> getLabelTags() {
        return this.labelTags;
    }

    public ReadOutboundTaskCallListRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ReadOutboundTaskCallListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ReadOutboundTaskCallListRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ReadOutboundTaskCallListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ReadOutboundTaskCallListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
