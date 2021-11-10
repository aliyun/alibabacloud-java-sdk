// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SmsShortUrlTaskQueryRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateKey")
    public String privateKey;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SmsShortUrlTaskQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        SmsShortUrlTaskQueryRequest self = new SmsShortUrlTaskQueryRequest();
        return TeaModel.build(map, self);
    }

    public SmsShortUrlTaskQueryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SmsShortUrlTaskQueryRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public SmsShortUrlTaskQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SmsShortUrlTaskQueryRequest setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public SmsShortUrlTaskQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
