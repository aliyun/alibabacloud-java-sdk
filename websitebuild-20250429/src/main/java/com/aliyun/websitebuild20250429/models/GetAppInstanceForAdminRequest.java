// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceForAdminRequest extends TeaModel {
    /**
     * <p>The ID of the delivery receipt. The delivery receipt ID is the value of the BizId parameter that is returned when you call the SendSms or SendBatchSms operation.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The domain name.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Wildcard domain names are supported. You can use the wildcard character asterisk (\*) to specify a wildcard domain name.</li>
     * </ul>
     * <p>For example, you can enter \*.baidu.com to specify the domain name baidu.com.</p>
     * 
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static GetAppInstanceForAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceForAdminRequest self = new GetAppInstanceForAdminRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceForAdminRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppInstanceForAdminRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
