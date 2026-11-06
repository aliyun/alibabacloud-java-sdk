// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListCollaborationGroupMembersRequest extends TeaModel {
    /**
     * <p>协作空间ID，必填，长度1至64。调用者必须是该租户下该空间的有效成员。可从ListCollaborationGroups返回的items中获取。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cg_9401</p>
     */
    @NameInMap("collaborationGroupId")
    public String collaborationGroupId;

    /**
     * <p>成员显示名称搜索关键词，可选，最长256字符；忽略大小写，先筛选后分页。不传时查询全部有效成员。</p>
     * 
     * <strong>example:</strong>
     * <p>销售</p>
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

    public static ListCollaborationGroupMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollaborationGroupMembersRequest self = new ListCollaborationGroupMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListCollaborationGroupMembersRequest setCollaborationGroupId(String collaborationGroupId) {
        this.collaborationGroupId = collaborationGroupId;
        return this;
    }
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    public ListCollaborationGroupMembersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCollaborationGroupMembersRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCollaborationGroupMembersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCollaborationGroupMembersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
