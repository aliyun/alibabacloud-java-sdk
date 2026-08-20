// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class SetZoneLbaStatusRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see How to ensure idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>210bc45716943908285687176dcf0a</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>Specifies whether to enable the weight configuration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Open")
    public Boolean open;

    /**
     * <p>The hostname record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The DNS record type. Currently, only <strong>A</strong> and <strong>AAAA</strong> record types support the weight toggle.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>Zone ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fd507b3eec6bba982060561f5624ea6</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static SetZoneLbaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetZoneLbaStatusRequest self = new SetZoneLbaStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetZoneLbaStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetZoneLbaStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetZoneLbaStatusRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public SetZoneLbaStatusRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

    public SetZoneLbaStatusRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public SetZoneLbaStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SetZoneLbaStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SetZoneLbaStatusRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
