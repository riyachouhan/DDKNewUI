package com.ddkcommunity.fragment.mapmodule.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class phaseOneBonusModel implements Serializable
{

    @SerializedName("status")
    @Expose
    private Integer status;

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    private final static long serialVersionUID = -482248357661295742L;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class Datum implements Serializable
    {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("plan_id")
        @Expose
        private Integer planId;
        @SerializedName("pack_amt")
        @Expose
        private double packAmt;
        @SerializedName("points")
        @Expose
        private String points;
        @SerializedName("package_status")
        @Expose
        private String packageStatus;
        @SerializedName("payment_mode")
        @Expose
        private String paymentMode;
        @SerializedName("approve_date")
        @Expose
        private Object approveDate;
        @SerializedName("activate_date")
        @Expose
        private String activateDate;
        @SerializedName("is_active")
        @Expose
        private Integer isActive;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("up_ref_id")
        @Expose
        private Integer upRefId;
        @SerializedName("up_renewal_no")
        @Expose
        private Integer upRenewalNo;
        @SerializedName("email")
        @Expose
        private String email;
        private final static long serialVersionUID = 7117383895138317519L;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getPlanId() {
            return planId;
        }

        public void setPlanId(Integer planId) {
            this.planId = planId;
        }

        public Double getPackAmt() {
            return packAmt;
        }

        public void setPackAmt(Double packAmt) {
            this.packAmt = packAmt;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getPackageStatus() {
            return packageStatus;
        }

        public void setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
        }

        public String getPaymentMode() {
            return paymentMode;
        }

        public void setPaymentMode(String paymentMode) {
            this.paymentMode = paymentMode;
        }

        public Object getApproveDate() {
            return approveDate;
        }

        public void setApproveDate(Object approveDate) {
            this.approveDate = approveDate;
        }

        public String getActivateDate() {
            return activateDate;
        }

        public void setActivateDate(String activateDate) {
            this.activateDate = activateDate;
        }

        public Integer getIsActive() {
            return isActive;
        }

        public void setIsActive(Integer isActive) {
            this.isActive = isActive;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Integer getUpRefId() {
            return upRefId;
        }

        public void setUpRefId(Integer upRefId) {
            this.upRefId = upRefId;
        }

        public Integer getUpRenewalNo() {
            return upRenewalNo;
        }

        public void setUpRenewalNo(Integer upRenewalNo) {
            this.upRenewalNo = upRenewalNo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }
}
