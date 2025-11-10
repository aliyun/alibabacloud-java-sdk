// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetErrorCodeSolutionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A707AFA8-1A4C-5B2A-A165-8436C1EA38DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The solutions. Not all error codes have corresponding solutions. You can submit a ticket or use OpenAPI Explorer to contact technical support if necessary.</p>
     */
    @NameInMap("solutions")
    public java.util.List<GetErrorCodeSolutionsResponseBodySolutions> solutions;

    public static GetErrorCodeSolutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetErrorCodeSolutionsResponseBody self = new GetErrorCodeSolutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetErrorCodeSolutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetErrorCodeSolutionsResponseBody setSolutions(java.util.List<GetErrorCodeSolutionsResponseBodySolutions> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<GetErrorCodeSolutionsResponseBodySolutions> getSolutions() {
        return this.solutions;
    }

    public static class GetErrorCodeSolutionsResponseBodySolutions extends TeaModel {
        /**
         * <p>The content of the solution, which is in the markdown format.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0017-00000502</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource is not in a valid state for the operation.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The code of the product to which the solution belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The name of the product to which the solution belongs.</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The solution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0017-00000502</p>
         */
        @NameInMap("solutionId")
        public String solutionId;

        public static GetErrorCodeSolutionsResponseBodySolutions build(java.util.Map<String, ?> map) throws Exception {
            GetErrorCodeSolutionsResponseBodySolutions self = new GetErrorCodeSolutionsResponseBodySolutions();
            return TeaModel.build(map, self);
        }

        public GetErrorCodeSolutionsResponseBodySolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetErrorCodeSolutionsResponseBodySolutions setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetErrorCodeSolutionsResponseBodySolutions setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetErrorCodeSolutionsResponseBodySolutions setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetErrorCodeSolutionsResponseBodySolutions setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetErrorCodeSolutionsResponseBodySolutions setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

}
