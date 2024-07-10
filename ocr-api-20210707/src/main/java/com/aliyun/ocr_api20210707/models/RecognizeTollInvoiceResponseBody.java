// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTollInvoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;angle&quot;:0,&quot;data&quot;:{&quot;title&quot;:&quot;苏宁用打发&quot;,&quot;formType&quot;:&quot;发票联&quot;,&quot;invoiceCode&quot;:&quot;132001681414&quot;,&quot;invoiceNumber&quot;:&quot;53184969&quot;,&quot;date&quot;:&quot;&quot;,&quot;time&quot;:&quot;&quot;,&quot;vehicleType&quot;:&quot;客1&quot;,&quot;entranceName&quot;:&quot;江&quot;,&quot;exitName&quot;:&quot;&quot;,&quot;totalAmount&quot;:&quot;0.00&quot;},&quot;ftype&quot;:0,&quot;height&quot;:254,&quot;orgHeight&quot;:254,&quot;orgWidth&quot;:199,&quot;prism_keyValueInfo&quot;:[{&quot;key&quot;:&quot;title&quot;,&quot;keyProb&quot;:98,&quot;value&quot;:&quot;苏宁用打发&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:174,&quot;y&quot;:20},{&quot;x&quot;:174,&quot;y&quot;:35},{&quot;x&quot;:24,&quot;y&quot;:34},{&quot;x&quot;:24,&quot;y&quot;:19}],&quot;valueProb&quot;:98},{&quot;key&quot;:&quot;formType&quot;,&quot;keyProb&quot;:89,&quot;value&quot;:&quot;发票联&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:50,&quot;y&quot;:41},{&quot;x&quot;:131,&quot;y&quot;:37},{&quot;x&quot;:131,&quot;y&quot;:52},{&quot;x&quot;:50,&quot;y&quot;:56}],&quot;valueProb&quot;:89},{&quot;key&quot;:&quot;invoiceCode&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;132001681414&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:150,&quot;y&quot;:94},{&quot;x&quot;:150,&quot;y&quot;:105},{&quot;x&quot;:63,&quot;y&quot;:105},{&quot;x&quot;:63,&quot;y&quot;:94}],&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;invoiceNumber&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;53184969&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:119,&quot;y&quot;:109},{&quot;x&quot;:119,&quot;y&quot;:120},{&quot;x&quot;:63,&quot;y&quot;:120},{&quot;x&quot;:63,&quot;y&quot;:109}],&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;date&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;time&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;vehicleType&quot;,&quot;keyProb&quot;:95,&quot;value&quot;:&quot;客1&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:40,&quot;y&quot;:180},{&quot;x&quot;:40,&quot;y&quot;:192},{&quot;x&quot;:28,&quot;y&quot;:192},{&quot;x&quot;:28,&quot;y&quot;:180}],&quot;valueProb&quot;:95},{&quot;key&quot;:&quot;entranceName&quot;,&quot;keyProb&quot;:98,&quot;value&quot;:&quot;江&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:96,&quot;y&quot;:128},{&quot;x&quot;:96,&quot;y&quot;:140},{&quot;x&quot;:39,&quot;y&quot;:140},{&quot;x&quot;:39,&quot;y&quot;:128}],&quot;valueProb&quot;:98},{&quot;key&quot;:&quot;exitName&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;totalAmount&quot;,&quot;keyProb&quot;:85,&quot;value&quot;:&quot;0.00&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:70,&quot;y&quot;:181},{&quot;x&quot;:70,&quot;y&quot;:190},{&quot;x&quot;:55,&quot;y&quot;:190},{&quot;x&quot;:55,&quot;y&quot;:181}],&quot;valueProb&quot;:85}],&quot;sliceRect&quot;:{&quot;x0&quot;:0,&quot;y0&quot;:2,&quot;x1&quot;:196,&quot;y1&quot;:1,&quot;x2&quot;:198,&quot;y2&quot;:251,&quot;x3&quot;:0,&quot;y3&quot;:252},&quot;width&quot;:199}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTollInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTollInvoiceResponseBody self = new RecognizeTollInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTollInvoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeTollInvoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeTollInvoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeTollInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
