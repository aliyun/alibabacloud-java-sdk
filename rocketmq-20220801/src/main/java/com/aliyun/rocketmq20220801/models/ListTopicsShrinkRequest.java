// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsShrinkRequest extends TeaModel {
    @NameInMap("filter")
    public String filter;

    @NameInMap("messageTypes")
    public String messageTypesShrink;

    @NameInMap("pageNumber")
    public Integer pageNumber;

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
