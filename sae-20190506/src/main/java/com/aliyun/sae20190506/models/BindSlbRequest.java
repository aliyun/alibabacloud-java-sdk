// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BindSlbRequest extends TeaModel {
    /**
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>[{&quot;port&quot;:80,&quot;targetPort&quot;:8080,&quot;protocol&quot;:&quot;TCP&quot;}]</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;port&quot;:80,&quot;targetPort&quot;:8080,&quot;protocol&quot;:&quot;TCP&quot;}]</p>
     */
    @NameInMap("Internet")
    public String internet;

    /**
     * <p>The billing method of an Internet-facing SLB instance. The following billing methods are supported:</p>
     * <ul>
     * <li><strong>PayBySpec</strong>: Pay-by-specification.</li>
     * <li><strong>PayByCLCU</strong>: Pay-by-CLCU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayBySpec</p>
     */
    @NameInMap("InternetSlbChargeType")
    public String internetSlbChargeType;

    /**
     * <p>lb-bp1tg0k6d9nqaw7l1\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1tg0k6d9nqaw7l1****</p>
     */
    @NameInMap("InternetSlbId")
    public String internetSlbId;

    /**
     * <p>[{&quot;port&quot;:80,&quot;targetPort&quot;:8080,&quot;protocol&quot;:&quot;TCP&quot;}]</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;port&quot;:80,&quot;targetPort&quot;:8080,&quot;protocol&quot;:&quot;TCP&quot;}]</p>
     */
    @NameInMap("Intranet")
    public String intranet;

    /**
     * <p>The billing method of an Internal-facing SLB instance. The following billing methods are supported:</p>
     * <ul>
     * <li><strong>PayBySpec</strong>: Pay-by-specification.</li>
     * <li><strong>PayByCLCU</strong>: Pay-by-CLCU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayBySpec</p>
     */
    @NameInMap("IntranetSlbChargeType")
    public String intranetSlbChargeType;

    /**
     * <p>lb-bp1tg0k6d9nqaw7l1\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1tg0k6d9nqaw7l1****</p>
     */
    @NameInMap("IntranetSlbId")
    public String intranetSlbId;

    public static BindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSlbRequest self = new BindSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindSlbRequest setInternet(String internet) {
        this.internet = internet;
        return this;
    }
    public String getInternet() {
        return this.internet;
    }

    public BindSlbRequest setInternetSlbChargeType(String internetSlbChargeType) {
        this.internetSlbChargeType = internetSlbChargeType;
        return this;
    }
    public String getInternetSlbChargeType() {
        return this.internetSlbChargeType;
    }

    public BindSlbRequest setInternetSlbId(String internetSlbId) {
        this.internetSlbId = internetSlbId;
        return this;
    }
    public String getInternetSlbId() {
        return this.internetSlbId;
    }

    public BindSlbRequest setIntranet(String intranet) {
        this.intranet = intranet;
        return this;
    }
    public String getIntranet() {
        return this.intranet;
    }

    public BindSlbRequest setIntranetSlbChargeType(String intranetSlbChargeType) {
        this.intranetSlbChargeType = intranetSlbChargeType;
        return this;
    }
    public String getIntranetSlbChargeType() {
        return this.intranetSlbChargeType;
    }

    public BindSlbRequest setIntranetSlbId(String intranetSlbId) {
        this.intranetSlbId = intranetSlbId;
        return this;
    }
    public String getIntranetSlbId() {
        return this.intranetSlbId;
    }

}
