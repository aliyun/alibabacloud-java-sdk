// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigRequest extends TeaModel {
    /**
     * <p>The primary key associated with the playback domain name. This key generates authenticated URLs.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/464513.html">DescribeVsDomainConfigs</a> operation to query the AuthKey value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ocs*****ace</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><p><strong>no_auth</strong> (disabled)</p>
     * </li>
     * <li><p><strong>type_a</strong> (method A)</p>
     * </li>
     * <li><p><strong>type_b</strong> (method B)</p>
     * </li>
     * <li><p><strong>type_c</strong> (method C)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>type_a</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Your accelerated domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The URL to which live stream information is pushed.</p>
     * <blockquote>
     * <p>This URL must start with http\:// or https\://.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.com/xx">http://xxx.com/xx</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetVsStreamsNotifyUrlConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVsStreamsNotifyUrlConfigRequest self = new SetVsStreamsNotifyUrlConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetVsStreamsNotifyUrlConfigRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetVsStreamsNotifyUrlConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public SetVsStreamsNotifyUrlConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetVsStreamsNotifyUrlConfigRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SetVsStreamsNotifyUrlConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
