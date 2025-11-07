// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetGitRepositoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FASTJSON 2.0.x has been released, faster and more secure, recommend you upgrade.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><a href="https://github.com/alibaba/fastjson">https://github.com/alibaba/fastjson</a></p>
     */
    @NameInMap("HtmlUrl")
    public String htmlUrl;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsPrivate")
    public Boolean isPrivate;

    /**
     * <strong>example:</strong>
     * <p>13B71887-D215-53B5-8818-4D3190604B26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGitRepositoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGitRepositoryResponseBody self = new GetGitRepositoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGitRepositoryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetGitRepositoryResponseBody setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public GetGitRepositoryResponseBody setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public GetGitRepositoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
