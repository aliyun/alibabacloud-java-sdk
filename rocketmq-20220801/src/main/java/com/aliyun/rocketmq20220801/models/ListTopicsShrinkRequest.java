// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsShrinkRequest extends TeaModel {
    /**
     * <p>The condition that you want to use to filter topics in the instance. If you leave this parameter empty, all topics in the instance are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_test</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The message types of the topics.</p>
     */
    @NameInMap("messageTypes")
    public String messageTypesShrink;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
