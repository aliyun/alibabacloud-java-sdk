// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{ 	&quot;data&quot;: { 		&quot;licensePlateNumber&quot;: &quot;B-30T76&quot;, 		&quot;date&quot;: &quot;2018-09-28&quot;, 		&quot;invoiceCode&quot;: &quot;150001583910&quot;, 		&quot;invoiceNumber&quot;: &quot;22566685&quot;, 		&quot;mileage&quot;: &quot;22.8&quot;, 		&quot;fare&quot;: &quot;¥57.00&quot;, 		&quot;dropOffTime&quot;: &quot;01：40&quot;, 		&quot;pickUpTime&quot;: &quot;01：19&quot; 	}, 	&quot;ftype&quot;: 0, 	&quot;height&quot;: 982, 	&quot;orgHeight&quot;: 982, 	&quot;orgWidth&quot;: 364,  	&quot;width&quot;: 364 }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeTaxiInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceResponseBody self = new RecognizeTaxiInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeTaxiInvoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeTaxiInvoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeTaxiInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
