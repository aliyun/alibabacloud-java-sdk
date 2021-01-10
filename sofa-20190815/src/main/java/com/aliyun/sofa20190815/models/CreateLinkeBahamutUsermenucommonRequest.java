// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutUsermenucommonRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("MemuId")
    public String memuId;

    @NameInMap("Url")
    public String url;

    @NameInMap("UserEmpId")
    public String userEmpId;

    public static CreateLinkeBahamutUsermenucommonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutUsermenucommonRequest self = new CreateLinkeBahamutUsermenucommonRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutUsermenucommonRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateLinkeBahamutUsermenucommonRequest setMemuId(String memuId) {
        this.memuId = memuId;
        return this;
    }
    public String getMemuId() {
        return this.memuId;
    }

    public CreateLinkeBahamutUsermenucommonRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateLinkeBahamutUsermenucommonRequest setUserEmpId(String userEmpId) {
        this.userEmpId = userEmpId;
        return this;
    }
    public String getUserEmpId() {
        return this.userEmpId;
    }

}
