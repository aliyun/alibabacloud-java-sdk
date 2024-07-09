// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The supported language. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
     * 
     * <strong>example:</strong>
     * <p>111222333</p>
     */
    @NameInMap("AuthorizedUserId")
    public Long authorizedUserId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The scenario. Valid values:</p>
     * <ul>
     * <li>AUTH: the built-in authoritative module</li>
     * <li>FWD: the forward module</li>
     * <li>RA: the traffic analysis module</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTH</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The type of the virtual private cloud (VPC). Valid values:</p>
     * <ul>
     * <li>STANDARD: standard VPC</li>
     * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VpcType")
    public String vpcType;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeRegionsRequest setAuthorizedUserId(Long authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public DescribeRegionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRegionsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeRegionsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeRegionsRequest setVpcType(String vpcType) {
        this.vpcType = vpcType;
        return this;
    }
    public String getVpcType() {
        return this.vpcType;
    }

}
