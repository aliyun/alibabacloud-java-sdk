// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupsRequest extends TeaModel {
    /**
     * <p>空间名称搜索关键词，可选，最长256字符；不传或去除首尾空白后为空时不按名称过滤。</p>
     * 
     * <strong>example:</strong>
     * <p>工作流</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>页码，从1开始；请求省略时默认为1。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页记录数，取值1至100；请求省略时默认为20。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>业务租户ID，可选。必须属于当前调用身份的可访问租户；无权访问时拒绝请求。未传时按现有鉴权规则解析租户，多租户用户无法唯一确定时需显式指定。</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListCollaborationGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupsRequest self = new ListCollaborationGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCollaborationGroupsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCollaborationGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCollaborationGroupsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
