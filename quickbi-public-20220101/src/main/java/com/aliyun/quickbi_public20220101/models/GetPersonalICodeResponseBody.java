// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetPersonalICodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCE45E6D-9304-4F94-86BB-5A772B1615FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The AccessKey model.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;icode&quot;: &quot;V2Yc/dMFWBwTKLNCNxgnN<em><em><strong>z</strong></em>5ARu&quot;,
     *         &quot;icodeKey&quot;: &quot;b6f3</em>**32a62936&quot;,
     *         &quot;type&quot;: 1
     *     }</p>
     */
    @NameInMap("Result")
    public GetPersonalICodeResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPersonalICodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonalICodeResponseBody self = new GetPersonalICodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonalICodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPersonalICodeResponseBody setResult(GetPersonalICodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetPersonalICodeResponseBodyResult getResult() {
        return this.result;
    }

    public GetPersonalICodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPersonalICodeResponseBodyResult extends TeaModel {
        /**
         * <p>SK</p>
         * 
         * <strong>example:</strong>
         * <p>V2Yc/dMFWBwTKLNCNxgnN*<em><strong>z</strong></em>5ARu</p>
         */
        @NameInMap("Icode")
        public String icode;

        /**
         * <p>AK</p>
         * 
         * <strong>example:</strong>
         * <p>asdasd</p>
         */
        @NameInMap("IcodeKey")
        public String icodeKey;

        /**
         * <p>The AccessKey type. Currently, only the value 1 is supported, which indicates a personal AccessKey.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static GetPersonalICodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetPersonalICodeResponseBodyResult self = new GetPersonalICodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetPersonalICodeResponseBodyResult setIcode(String icode) {
            this.icode = icode;
            return this;
        }
        public String getIcode() {
            return this.icode;
        }

        public GetPersonalICodeResponseBodyResult setIcodeKey(String icodeKey) {
            this.icodeKey = icodeKey;
            return this;
        }
        public String getIcodeKey() {
            return this.icodeKey;
        }

        public GetPersonalICodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
