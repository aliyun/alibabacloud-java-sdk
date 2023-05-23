// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>模板内容过滤。</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>模板名称过滤。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>分页数，从1开始，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分页大小，默认为10。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>审核状态过滤。</p>
     * <p>- 0 : 审核中。</p>
     * <p>- 1 : 审核通过。</p>
     * <p>- 2 : 审核不通过。</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>模板类型过滤。</p>
     * <p>- 0 : 验证码。</p>
     * <p>- 1 : 短信通知。</p>
     * <p>- 2 : 推广短信。</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ListTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListTemplatesRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
