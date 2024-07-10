// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeShoppingReceiptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;data&quot;: {&quot;shopName&quot;: &quot;世纪联华椒江市府大道店&quot;, &quot;receiptDate&quot;: &quot;2020-04-23&quot;, &quot;receiptTime&quot;: &quot;20:26:00&quot;, &quot;contactNumber&quot;: &quot;88068111&quot;, &quot;shopAddress&quot;: &quot;&quot;, &quot;totalAmount&quot;: &quot;566.67&quot;}, &quot;ftype&quot;: 0, &quot;height&quot;: 1047, &quot;orgHeight&quot;: 1055, &quot;orgWidth&quot;: 690, &quot;prism_keyValueInfo&quot;: [{&quot;key&quot;: &quot;shopName&quot;, &quot;keyProb&quot;: 98, &quot;value&quot;: &quot;世纪联华椒江市府大道店&quot;, &quot;valuePos&quot;: [{&quot;x&quot;: 51, &quot;y&quot;: 239}, {&quot;x&quot;: 53, &quot;y&quot;: 208}, {&quot;x&quot;: 438, &quot;y&quot;: 231}, {&quot;x&quot;: 436, &quot;y&quot;: 262}], &quot;valueProb&quot;: 98}, {&quot;key&quot;: &quot;receiptDate&quot;, &quot;keyProb&quot;: 100, &quot;value&quot;: &quot;2020-04-23&quot;, &quot;valuePos&quot;: [{&quot;x&quot;: 292, &quot;y&quot;: 677}, {&quot;x&quot;: 293, &quot;y&quot;: 649}, {&quot;x&quot;: 428, &quot;y&quot;: 651}, {&quot;x&quot;: 428, &quot;y&quot;: 680}], &quot;valueProb&quot;: 100}, {&quot;key&quot;: &quot;receiptTime&quot;, &quot;keyProb&quot;: 100, &quot;value&quot;: &quot;20:26:00&quot;, &quot;valuePos&quot;: [{&quot;x&quot;: 435, &quot;y&quot;: 681}, {&quot;x&quot;: 435, &quot;y&quot;: 652}, {&quot;x&quot;: 548, &quot;y&quot;: 656}, {&quot;x&quot;: 547, &quot;y&quot;: 684}], &quot;valueProb&quot;: 100}, {&quot;key&quot;: &quot;contactNumber&quot;, &quot;keyProb&quot;: 100, &quot;value&quot;: &quot;88068111&quot;, &quot;valuePos&quot;: [{&quot;x&quot;: 52, &quot;y&quot;: 271}, {&quot;x&quot;: 52, &quot;y&quot;: 242}, {&quot;x&quot;: 160, &quot;y&quot;: 246}, {&quot;x&quot;: 159, &quot;y&quot;: 274}], &quot;valueProb&quot;: 100}, {&quot;key&quot;: &quot;shopAddress&quot;, &quot;keyProb&quot;: 100, &quot;value&quot;: &quot;&quot;, &quot;valueProb&quot;: 100}, {&quot;key&quot;: &quot;totalAmount&quot;, &quot;keyProb&quot;: 100, &quot;value&quot;: &quot;566.67&quot;, &quot;valuePos&quot;: [{&quot;x&quot;: 206, &quot;y&quot;: 522}, {&quot;x&quot;: 206, &quot;y&quot;: 493}, {&quot;x&quot;: 313, &quot;y&quot;: 495}, {&quot;x&quot;: 313, &quot;y&quot;: 524}], &quot;valueProb&quot;: 100}], &quot;sliceRect&quot;: {&quot;x0&quot;: 17, &quot;y0&quot;: 8, &quot;x1&quot;: 690, &quot;y1&quot;: 42, &quot;x2&quot;: 690, &quot;y2&quot;: 1054, &quot;x3&quot;: 6, &quot;y3&quot;: 1053}, &quot;width&quot;: 684}</p>
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

    public static RecognizeShoppingReceiptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeShoppingReceiptResponseBody self = new RecognizeShoppingReceiptResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeShoppingReceiptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeShoppingReceiptResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeShoppingReceiptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeShoppingReceiptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
