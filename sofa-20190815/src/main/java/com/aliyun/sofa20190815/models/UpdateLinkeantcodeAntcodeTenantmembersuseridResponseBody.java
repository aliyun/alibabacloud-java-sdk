// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AccessLevel")
    public Long accessLevel;

    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("Email")
    public String email;

    @NameInMap("ExpiresAt")
    public String expiresAt;

    @NameInMap("ExternUid")
    public String externUid;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("State")
    public String state;

    @NameInMap("Username")
    public String username;

    @NameInMap("WebUrl")
    public String webUrl;

    public static UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody self = new UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setAccessLevel(Long accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Long getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public UpdateLinkeantcodeAntcodeTenantmembersuseridResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

}
