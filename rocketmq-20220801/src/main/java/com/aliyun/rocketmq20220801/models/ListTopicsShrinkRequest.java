// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsShrinkRequest extends TeaModel {
    /**
     * <p>The filter condition for the query. If not provided, all topics under the instance will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_test</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The message type of the topic.</p>
     */
    @NameInMap("messageTypes")
    public String messageTypesShrink;

    /**
     * <p>Page number, indicating which page of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, the maximum number of results to display per page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListTopicsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsShrinkRequest self = new ListTopicsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicsShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTopicsShrinkRequest setMessageTypesShrink(String messageTypesShrink) {
        this.messageTypesShrink = messageTypesShrink;
        return this;
    }
    public String getMessageTypesShrink() {
        return this.messageTypesShrink;
    }

    public ListTopicsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
