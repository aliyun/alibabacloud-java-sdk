// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DEA36EF-C97D-5658-A4AC-4F5DB08D1A89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource details.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;NewEip&quot;: {
     *     &quot;Type&quot;: &quot;ALIYUN::VPC::EIP&quot;,
     *     &quot;Success&quot;: true,
     *     &quot;Result&quot;: {
     *       &quot;Order&quot;: {
     *         &quot;TaxAmount&quot;: 0.0,
     *         &quot;Currency&quot;: &quot;CNY&quot;,
     *         &quot;RuleIds&quot;: [
     *           &quot;102204102264****&quot;
     *         ],
     *         &quot;TradeAmount&quot;: 87.5,
     *         &quot;OriginalAmount&quot;: 125.0,
     *         &quot;DiscountAmount&quot;: 37.5
     *       },
     *       &quot;OrderSupplement&quot;: {
     *         &quot;ChargeType&quot;: &quot;PrePaid&quot;,
     *         &quot;Period&quot;: 1,
     *         &quot;Quantity&quot;: 1,
     *         &quot;PriceType&quot;: &quot;Total&quot;,
     *         &quot;PeriodUnit&quot;: &quot;Month&quot;
     *       },
     *       &quot;InquiryType&quot;: &quot;Buy&quot;,
     *       &quot;Rules&quot;: {
     *         &quot;Rule&quot;: [
     *           {
     *             &quot;RuleDescId&quot;: &quot;102204102264****&quot;,
     *             &quot;Name&quot;: &quot;Contract_Discount_Full_Order_30%_Off&quot;
     *           }
     *         ]
     *       }
     *     }
     *   }
     * }</p>
     */
    @NameInMap("Resources")
    public java.util.Map<String, ?> resources;

    public static GetTemplateEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostResponseBody self = new GetTemplateEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateEstimateCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateEstimateCostResponseBody setResources(java.util.Map<String, ?> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.Map<String, ?> getResources() {
        return this.resources;
    }

}
